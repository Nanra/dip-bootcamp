package io;

import java.math.BigDecimal;

public class PrintOutput {

    public void printString(String inputText) {
        System.out.print(inputText);
    }

    public void printNumber(int inputNumber) {
        System.out.println(inputNumber);
    }

    public void printBigDecimal(BigDecimal inputNumber) {
        System.out.println(inputNumber);
    }

    public void printObject(Object inputObject) {
        System.out.println(inputObject);
    }
}
