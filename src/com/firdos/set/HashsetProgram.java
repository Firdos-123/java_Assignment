package com.firdos.set;
import java.util.Set;
import java.util.HashSet;

public class HashsetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>s=new HashSet<String>();
		int size=s.size();
		System.out.println("size before:"+size);
		s.add("Orange");
		s.add("Blue");
		s.add("Red");
		s.add("Red");
		System.out.println("set"+s);
		System.out.println(s.remove("Red"));
		
		if(s.equals("Black")) {
			System.out.println("Black is added");
		}
		else {
			s.add("Black");
			System.out.println("Black is added successfully");
			
		}
		
		
	}

}
