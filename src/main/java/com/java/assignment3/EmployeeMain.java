package com.java.assignment3;

import java.util.List;
import java.util.Optional;


public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployeedata();
        Optional<Employee> empWithPython = findEmpWithTechn(employees, "python");

        if (empWithPython.isPresent()) {
            Employee emp = empWithPython.get();
            System.out.println("Employee ID: " + emp.getEmployeeId());
            System.out.println("Name: " + emp.getName());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());
            System.out.println("Email: " + emp.getEmail());
            System.out.println("Technology: " + emp.getTechnology());
        } else {
            System.err.println("No employee found with technology Python.");
        }

    }

    public static Optional<Employee> findEmpWithTechn(List<Employee> employees, String technology) {
        return employees.stream()
                .filter(emp -> emp.getTechnology().equalsIgnoreCase(technology))
                .findAny();
    }

}
