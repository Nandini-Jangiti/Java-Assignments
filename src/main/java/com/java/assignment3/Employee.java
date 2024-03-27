package com.java.assignment3;


import java.util.ArrayList;
import java.util.List;

class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    private String email;

    private String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public Employee(int employeeId, String name, double salary, String department, String email, String technology) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
        this.technology = technology;
    }
    public static List<Employee> getEmployeedata() {
        List<Employee> records = new ArrayList<>();
        records.add(new Employee(101, "nandini", 50000, "HR", "nandini@gmail.com","python"));
        records.add(new Employee(102, "jyothi", 60000, "Developer","jyothi@gmail.com","java"));
        records.add(new Employee(103, "amrutha", 55000, "IT","amrutha@gmail.com","python"));
        records.add(new Employee(101, "akash", 50000, "HR","akash@gmail.com","c#"));
        return records;
    }
}
