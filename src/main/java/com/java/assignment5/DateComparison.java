package com.java.assignment5;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String datef = scanner.nextLine();
        LocalDate inputDate = LocalDate.parse(datef);
        LocalDate currentdate = LocalDate.now();
        if (inputDate.isEqual(currentdate)) {
            System.out.println("entered input date is current date.");
        } else if (inputDate.isBefore(currentdate)) {
            System.out.println("entered input date is before the current date.");
        } else {
            System.out.println("entered input date is after the current date.");
        }
    }
}

