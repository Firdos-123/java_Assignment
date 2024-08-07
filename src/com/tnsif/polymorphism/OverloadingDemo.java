package com.tnsif.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("Addition of two integers:"+MethodOverloading.addition(10,20));
		System.out.println("Addition of two floats:"+MethodOverloading.addition(10.5f,20.4f));
		System.out.println("Addition of two float and integers:"+MethodOverloading.addition(10,20.3f));
		System.out.println("Addition of two integers:"+MethodOverloading.addition("Firdos","Faiz"));
		
		// TODO Auto-generated method stub

	}

}
