package com.firdos.Assignment10;

public class Mythreadtwo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythreadtwo t=new Mythreadtwo();
		Thread tone= new Thread(t);
		tone.start();
		
		
		
	}
	@Override
	public void run() {
      
		System.out.println("Using runnable interface I an creating a thread");
		
		
	}

}
