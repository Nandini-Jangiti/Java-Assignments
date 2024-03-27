package com.java.assignment;

import java.util.ArrayList;
import java.util.List;

class Employeeinfo {
    private int employeeId;
    private String name;
    private double salary;
    private String department;

    private String email;

    public Employeeinfo(int employeeId, String name, double salary, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.email = email;
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
    public static List<Employeeinfo> getEmployeedata() {

        List<Employeeinfo> records = new ArrayList<>();
        records.add(new Employeeinfo(101, "nandini", 50000, "HR", "nandini@gmail.com"));
        records.add(new Employeeinfo(102, "jyothi", 60000, "Developer","jyothi@gmail.com"));
        records.add(new Employeeinfo(103, "amrutha", 55000, "IT","amrutha@gmail.com"));
        records.add(new Employeeinfo(101, "akash", 50000, "HR","akash@gmail.com"));
        return records;
    }
}
