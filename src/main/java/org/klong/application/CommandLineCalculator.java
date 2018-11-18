package org.klong.application;

import org.klong.domain.model.calculator.Calculator;
import org.klong.domain.model.calculator.CalculatorFactory;
import org.klong.domain.model.operator.OperationStatus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class CommandLineCalculator {
    private Calculator calculator = CalculatorFactory.createCalculator();
    private final String delimiter = " ";

    public void waitForInput() throws IOException {
        String read = "";
        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            read = scanner.nextLine();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input:");
            read = reader.readLine();

            processInput(read);
            printStack(calculator.output());
        }
    }

    private void printStack(Stack<Double> output) {
        StringBuilder builder = new StringBuilder();
        for (Double element : output) {
            builder.append(element);
            builder.append(delimiter);
        }
        System.out.println("Stack:" + builder.toString());
    }

    private void processInput(String read) {
        ExpressionProcessor expressionProcessor = new ExpressionProcessor(read, delimiter);
        List<String> paramList = expressionProcessor.paramList();

        OperationStatus status = null;
        for (String param : paramList) {
//            if (StringUtils.isNumeric(param)) {
//                calculator.input(Double.valueOf(param));
//                status = OperationStatus.SUCCESS;
//            } else {
//
//            }
            switch (param) {
                case "+":
                    status = calculator.add();
                    break;
                case "-":
                    status = calculator.substract();
                    break;
                case "*":
                    status = calculator.multiply();
                    break;
                case "/":
                    status = calculator.divide();
                    break;
                case "sqrt":
                    status = calculator.sqrt();
                    break;
                case "undo":
                    status = calculator.undo();
                    break;
                case "clear":
                    status = calculator.clear();
                    break;
                default:
                    // todo validation
                    calculator.input(Double.valueOf(param));
                    status = OperationStatus.SUCCESS;
            }

            if (OperationStatus.INSUFFICIENT_PARAM.equals(status)) {
                System.out.println("operator " + param + " : insucient parameters");
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new CommandLineCalculator().waitForInput();
    }
}
