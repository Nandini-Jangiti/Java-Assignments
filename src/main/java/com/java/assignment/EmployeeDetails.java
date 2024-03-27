package com.java.assignment;

import java.util.*;

public class EmployeeDetails {

    public static void main(String[] args) {

        List<Employeeinfo> employeeRecords = Employeeinfo.getEmployeedata();


        List<Integer> emplIds = new ArrayList<>();
        for (Employeeinfo r : employeeRecords) {
            emplIds.add(r.getEmployeeId());
        }
        System.out.println("sortinglist:"+emplIds);
        System.out.println("------------------------------");

        List<Integer> uniqueEmpIds = new ArrayList<>(Set.copyOf(emplIds));
        System.out.println("after removing duplicates list :" +uniqueEmpIds);
        System.out.println("-----------------------------------");


        Collections.sort(uniqueEmpIds, Collections.reverseOrder());
        System.out.println("sorting the employees ids in descending order:"+uniqueEmpIds);
        System.out.println("-----------------------------------------------------");


        Map<Integer, Employeeinfo> emp = new HashMap<>();
        for (Employeeinfo record : employeeRecords) {
            emp.put(record.getEmployeeId(), record);
        }
       System.out.println("stored against each employeeid" +emp);


        System.out.println("---------------------------------------------------");
        System.out.println("employee details");
        for (Integer id : uniqueEmpIds) {
            Employeeinfo empdata = emp.get(id);
            if (empdata != null) {
                System.out.println("Employee ID: " + id);
                System.out.println("Employee Name: " + empdata.getName());
                System.out.println("Salary: " + empdata.getSalary());
                System.out.println("Department: " + empdata.getDepartment());
                System.out.println("email: " + empdata.getEmail());

            }

        }

    }

}

