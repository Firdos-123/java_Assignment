package com.firdos.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList Listone=new ArrayList();
    System.out.println("Check wheather list is empty or not" +Listone.isEmpty());
    
    Listone.add(2);
    Listone.add('a');
    Listone.add("mumbai");
    Listone.add(2.00);
    System.out.println(Listone);
    System.out.println("the size of list" +Listone.size());
    System.out.println("the element t location"+" "+Listone.get(2));
    System.out.println("Check element is present or not:"+Listone.contains(22));
    //Collections.sort(Listone);
 
    ArrayList<String>ob= new ArrayList<String>();
    ob.add("rain");
    ob.add("delhi");
    ob.add("banglore");
    Iterator<String>i=ob.iterator();
    while(i.hasNext()) {
    	String nm=i.next();
    	System.out.println(nm);
    	
    }
    
    
    
	}

}
