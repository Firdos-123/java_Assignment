package com.firdos.Exceptions;

public class ThrowProgram {
	
	public static void validate(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("invalidage");
		}
		else {
			System.out.println("You can vote");
		}
	}

}
