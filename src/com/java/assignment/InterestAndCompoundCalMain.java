package com.java.assignment;

import java.util.Scanner;

public class InterestAndCompoundCalMain {

    public static void main(String[] args) {
        double p, rate, t, sim, com;
        int choice;

        Scanner ob = new Scanner(System.in);

        System.out.println("Select the type of interest calculation:");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        choice = ob.nextInt();

        System.out.println("Enter principle Amount:");
        p = ob.nextDouble();

        System.out.println("Enter the No. of years:");
        t = ob.nextDouble();

        System.out.println("Enter the Rate of interest:");
        rate = ob.nextDouble();

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
    }
}
