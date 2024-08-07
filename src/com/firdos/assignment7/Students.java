package com.firdos.assignment7;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassTenth studentone=new ClassTenth("Firdos",211250,"Kurla","Computer");
       studentone.displayDetails();
       
       ClassTenth studenttwo=new ClassTenth("Fatima",123);
       studenttwo.displayDetails();
       
       ClassTenth student=new ClassTenth();
       student.takeInput();
       student.displayDetails();
	}

}
