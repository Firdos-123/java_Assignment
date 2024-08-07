package com.firdos.generics;
import java.util.ArrayList;




public class Inventory <T extends Product> {
	
	protected ArrayList<T> inventory;

	public Inventory() {
		
		inventory=new ArrayList<>();
	}
	
	public void add(T product) {
		inventory.add(product);
	}
	
	public boolean  remove(String productid) {
		for(T product: inventory) {
			
			if(product.getID().equals(productid)) {
				inventory.remove(product);
				return true;
			}
			
		}
		return false;
		
	}
	public ArrayList<T> display(){
		return new ArrayList<>(inventory);
		
	}

}
