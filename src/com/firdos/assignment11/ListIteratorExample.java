package com.firdos.assignment11;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		obj.add(30);
		System.out.println(obj);
		
		ListIterator list=obj.listIterator();
		
		System.out.println("Element iterates in forward direction:");
		
		while(list.hasNext()) {
			System.out.println(list.next()+" ");
		}
		
		ListIterator list1=obj.listIterator(obj.size());
		
		System.out.println("Element iterates in backward direction:");
		
		while(list1.hasPrevious()) {
			System.out.println(list1.previous()+" ");
		}
		
		
	}

}
