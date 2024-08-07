package com.firdos.assignment.employees;

//The Manager class represents a manager with additional attributes.
public class Manager extends Employees {
	
     private String department;
  
     public Manager(String name, String employeeId, double salary, String department) {
         super(name, employeeId, salary);
         this.department = department;
     }

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}   
}
