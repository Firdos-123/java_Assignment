package com.firdos.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Laptop> lap=new ArrayList<Laptop>();
   
   lap.add(new Laptop("dell", 15,60000));
   lap.add(new Laptop("Hp", 30, 80000));
   lap.add(new Laptop("Apple", 50, 90000));
   
   Collections.sort(lap);
   
   for(Laptop l:lap) {
	  System.out.println(l);
   }
   
	}

}
