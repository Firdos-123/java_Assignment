package com.firdos.Assignment9;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Throws ob=new Throws();
     
     Scanner obj = new Scanner(System.in);
     System.out.print("Enter true to simulate SQLException, false to simulate IOException: ");
     boolean exception = obj.nextBoolean();
     
     
     try {
    	 ob.display(exception);
     }
     
     catch(IOException e) {
    	 
    	 System.out.println("Caught Exception"+e);
     }
     
     catch(SQLException e) {
    	 System.out.println("SQLException occurred: "+ e.getMessage());
     }
     Throws obone=new Throws();
     
     try {
    	 obone.loadclass("com.example.NonClass");
			
		}
		catch(ClassNotFoundException e) {
			
			System.out.println("ClassNotFoundException caught:"+ e.getMessage());
		}
     
	}

}
