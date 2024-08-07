package com.firdos.assignment.employees;

//The Developer class represents a developer with additional attributes.
public class Developer extends Employees {

	 private String programmingLanguage;
	 
	 public Developer(String name, String employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	 
}
