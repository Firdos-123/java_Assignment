package com.firdos.assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student students = new Student();
		
		  Commission commissionEmployee = new Commission();
	        
	        // Accepting details of the sales employee
	        commissionEmployee.acceptDetaills();
	        
	        double commission = commissionEmployee.calculateCommission();
	        System.out.println("Commission: " + commission);
	        
	}

}
