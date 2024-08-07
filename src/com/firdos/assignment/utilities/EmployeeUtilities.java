package com.firdos.assignment.utilities;

import com.firdos.assignment.employees.Employees;
import com.firdos.assignment.employees.Manager;
import com.firdos.assignment.employees.Developer;

public class EmployeeUtilities {
	
	public static void printEmployeeDetails(Employees employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
        
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }

	
}
