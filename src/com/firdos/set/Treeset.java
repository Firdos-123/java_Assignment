package com.firdos.set;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String>s=new TreeSet<String>();
      //to check empty
      boolean empty= s.isEmpty();
      System.out.println("the tree is empty:"+empty);
      s.add("India");
      s.add("DSA");
      s.add("Banglore");
      s.add("Mumbai");
      s.add(null);
      System.out.println(s);
	}

}
