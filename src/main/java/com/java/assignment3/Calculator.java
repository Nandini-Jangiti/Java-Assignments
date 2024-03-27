package com.java.assignment3;

import java.util.Scanner;

interface Operation {
    double apply(double x, double y);
}
public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the operation (add, subtract, multiply, divide):");
        String operator = scanner.next();

        Operation operation;

        switch (operator) {
            case "add":
                operation = (x, y) -> x + y;
                break;
            case "subtract":
                operation = (x, y) -> x - y;
                break;
            case "multiply":
                operation = (x, y) -> x * y;
                break;
            case "divide":
                operation = (x, y) -> {
                    if (y == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    return x / y;
                };
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        double result = operation.apply(num1, num2);
        System.out.println("Result: " + result);


    }
}
