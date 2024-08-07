package com.firdos.Assignment10;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ChildThread tone=new ChildThread(1,"First");
		ChildThread ttwo=new ChildThread(2,"Second");
		
		tone.start();
		ttwo.start();
		System.out.println("end of main method");
	}

}
