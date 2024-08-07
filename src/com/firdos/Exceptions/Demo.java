package com.firdos.Exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
		ThrowProgram.validate(5);
	}
 catch(ArithmeticException e) {
	 
	 System.out.println("exception handled"+ " "+e.getMessage());
 }
	}
}
