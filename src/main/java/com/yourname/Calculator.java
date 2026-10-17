package com.yourname;

public class Calculator {

    public double calculate(double num1, double num2, String op) {
        double res;
        switch (op) {
            case "+":
                res = num1 + num2;
                
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Divide by zero");
                }
                res = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Unknown operator");
        }
        return res;
    }
}
