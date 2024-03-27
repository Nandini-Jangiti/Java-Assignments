package com.java.assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nandini", 30, 5, 50000, "HR"));
        employees.add(new Employee("Jangiti", 35, 8, 60000, "Marketing"));
        employees.add(new Employee("amrutha", 28, 3, 45000, "Finance"));
        employees.add(new Employee("akash", 40, 10, 70000, "Marketing"));
        employees.add(new Employee("Naveen", 32, 6, 55000, "HR"));

        long totalEmployees = employees.size();
        System.out.println("Total number of employees: " + totalEmployees);

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by department: " + employeesByDepartment);


        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total salary paid to all employees: " + totalSalary);


        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary, Double::sum));
        System.out.println("Total salary paid to employees of each department: " + totalSalaryByDepartment);


        List<Employee> employeesSortedByAge = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
        System.out.println("Employees sorted by age: " + employeesSortedByAge);

        List<Employee> employeesSortedByExperience = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .toList();
        System.out.println("Employees sorted by experience: " + employeesSortedByExperience);
    }
}
