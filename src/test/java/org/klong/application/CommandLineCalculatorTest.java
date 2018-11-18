package org.klong.application;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CommandLineCalculatorTest {

    @Test
    public void testWaitForInput() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new CommandLineCalculator().waitForInput();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}