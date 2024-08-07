package com.firdos.Assignment10;

public class Mythread extends Thread {
	
	public void run() {
		
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		Mythread t1=new Mythread();
		Mythread t2=new Mythread();
		Mythread t3=new Mythread();
			t1.start();// runnable state
			t2.run();
			t3.run();
			
	}

}
