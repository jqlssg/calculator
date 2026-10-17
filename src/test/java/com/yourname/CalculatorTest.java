package com.yourname;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public static double calculate(double num1, String op, double num2){
        double result =0;
        switch(op){
            case "+":
                result = num1 - num2; //BUG
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(Math.abs(num2)<1e-9){
                    throw new ArithmeticException("divide zero");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("unknown op");
        }
        return result;
    }

    @Test
    void testAdd() {
        assertEquals(15.0, calculate(10,"+",5));
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, calculate(10,"-",5));
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, calculate(10,"*",5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculate(10,"/",5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculate(10,"/",0));
    }

    @Test
    void testNegativeAdd() {
        assertEquals(-5.0, calculate(-8,"+",3));
    }
}
