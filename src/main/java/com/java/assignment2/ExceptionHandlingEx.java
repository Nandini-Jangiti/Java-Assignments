package com.java.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingEx {

    public static void main(String[] args) {
        double p, rate, t, sim, com;
        int choice;

        Scanner ob = new Scanner(System.in);

        try {
            System.out.println("Select the type of interest calculation:");
            System.out.println("1. Simple Interest");
            System.out.println("2. Compound Interest");
            choice = ob.nextInt();
            if (choice != 1 && choice != 2) {
                throw new IllegalArgumentException("Invalid choice! Please enter 1 or 2.");
            }

            System.out.println("Enter principle Amount:");
            p = ob.nextDouble();
            if (p <= 0) {
                throw new IllegalArgumentException("Principal amount must be greater than zero.");
            }

            System.out.println("Enter the No. of years:");
            t = ob.nextDouble();
            if (t <= 0) {
                throw new IllegalArgumentException("Number of years must be greater than zero.");
            }

            System.out.println("Enter the Rate of interest:");
            rate = ob.nextDouble();
            if (rate <= 0) {
                throw new IllegalArgumentException("Rate of interest must be greater than zero.");
            }

            switch (choice) {
                case 1:
                    sim = (p * t * rate) / 100;
                    System.out.println("Simple Interest = " + sim);
                    break;
                case 2:
                    com = p * Math.pow(1.0 + rate / 100.0, t) - p;
                    System.out.println("Compound Interest = " + com);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid format.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
