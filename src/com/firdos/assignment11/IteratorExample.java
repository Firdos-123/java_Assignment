package com.firdos.assignment11;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> sc=new ArrayList<String>();
		sc.add("India");
		sc.add("Mumbai");
		sc.add("Pune");
		sc.add("GOA");
		sc.add("chennai");
		System.out.println(sc);
		
		Iterator<String> obj=sc.iterator();
		
		while(obj.hasNext()) {
			System.out.println(obj.next()+" ");
		}
		Iterator<String> obj1=sc.iterator();
		while(obj1.hasNext()) {
		if(obj1.next().equals("GOA")) {
			obj1.remove();
			System.out.println("removed");
			
		}
		}
		System.out.println(sc);
		
		
	}

}
