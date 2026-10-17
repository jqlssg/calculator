package com.yourname;

public class App {
    public static void main(String[] args) {
        if (args.length !=3) {
            System.out.println("Please input 3 arguments: number1 operator number2");
            return;
        }
        double num1, num2;
        try{
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[2]);
        }catch (NumberFormatException e){
            System.out.println("Invalid number input");
            return;
        }
        String op = args[1];
        double result = 0;
        switch (op){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(Math.abs(num2) < 1e-9){
                    System.out.println("Error: division by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Unknown operator");
                return;
        }
        System.out.printf("Result: %.2f%n",result);
    }
}
