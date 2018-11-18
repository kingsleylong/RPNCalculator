package org.klong.domain.model;

import org.klong.domain.model.calculator.Calculator;

import java.math.BigDecimal;
import java.util.Stack;

public class CalculatorTest {
    public void testCalculate() {
        String expression = "5 4 3 2 *";

        Calculator calculator = new Calculator();
        calculator.input(expression);
        calculator.calculate();
        ConsoleStackPrinter.print(calculator.stack());

        calculator.input(anotherExpression);
        calculator.calculate();
        ConsoleStackPrinter.print(calculator.stack());
    }

    public void testAssembler() {
        // calculator.input(expression);
        Stack<BigDecimal> stack = new Stack<>();

        String[] elements = expression.split(delimiter);
        for (String element : elements) {
            OperatorEnum operatorEnum = OperatorEnum.matches(element);
            if (null != operatorEnum) {
                operator.operate(stack);
            } else {
                // spec verfication
                stack.push(BigDecimal.valueOf(Double.valueOf(element)));
            }
        }

    }

    public void testSqrtOperator() {
        Stack<Double> stack = new Stack<>();
        Double rightOperand = stack.pop();
        operator.operate(leftOperand, rightOperand);

        Math.sqrt(rightOperand);
    }

    public void testDivideOperator() {
        Stack<Double> stack = new Stack<>();
        Double rightOperand = stack.pop();
        operator.operate(leftOperand, rightOperand);

        Math.div(rightOperand);
    }

    public void testCommandLineInterface() {
        CommandLineInterface cliInterface = new CommandLineInterface();
        cliInterface.waitForInput();

        // input expression from command line, press Enter

        // shows the stack
    }
}
