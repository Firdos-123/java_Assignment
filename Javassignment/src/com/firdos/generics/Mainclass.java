package com.firdos.generics;
import java.util.Scanner;
import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Inventory<Product> invent=new Inventory<>();
		
		while(true) {
			
			System.out.println("1.Add product");
			System.out.println("2.remove product");
			System.out.println("3.exit");
			System.out.println("Enter the option:");
			int choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the id:");
				String id=sc.nextLine();
				System.out.println("Enter the name:");
				String name=sc.nextLine();
				System.out.println("Enter the price");
				double price=sc.nextDouble();
				Product product=new Product(id,name,price);
				invent.add(product);
				System.out.println("Add successfully");
				break;
			case 2:
				System.out.println("enter the id to remove:");
				String reid=sc.nextLine();
				boolean isremoved =invent.remove(reid);
				if(isremoved) {
					System.out.println("remove successfully.");
				}
				else {
					System.out.println("id not found.");
				}
				break;
			case 3:
				break;
				
				
			}
			ArrayList<Product> product=invent.display();
			System.out.println("the Inventory list:");
			for(Product p:product) {
				System.out.println(p);
			}
		}
		
        
		
	}

}
