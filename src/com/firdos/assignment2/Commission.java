package com.firdos.assignment2;
import java.util.Scanner;

public class Commission {

	private String name;
	private String address;
	private String phone;
	private double salesAmount ;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	public void acceptDetaills() {
		
		Scanner object= new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		name = object.nextLine();
		
		System.out.println("Enter the address: ");
		address = object.nextLine();
	
	
		System.out.println("Enter the phone: ");
		phone = object.nextLine();
		
		System.out.println("Enter the salesAmount: ");
		salesAmount = object.nextDouble();
		
		
		}
	
	 public double calculateCommission() {
	        double commission;
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000 && salesAmount < 100000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000 && salesAmount < 50000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }
	        return commission;
	    }
	
	
}
