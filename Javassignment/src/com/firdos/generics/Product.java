package com.firdos.generics;

public class Product {

	String ID;
	String name;
	double price;
	public Product(String iD, String name, double price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
