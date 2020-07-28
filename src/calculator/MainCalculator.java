package calculator;

import java.math.BigDecimal;

public class MainCalculator {

    // Declaring Multiplication Method
    public BigDecimal multiplication(BigDecimal firstNum, BigDecimal secondNum){
        return firstNum.multiply(secondNum);
    }

    // Declaring Addition Method
    public BigDecimal addition(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.add(secondNum);
    }

    // Declaring Divide Method
    public BigDecimal divide(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.divide(secondNum);
    }

    // Declaring Subtraction Method
    public BigDecimal subtraction(BigDecimal firstNum, BigDecimal secondNum) {
        return firstNum.subtract(secondNum);
    }
}
