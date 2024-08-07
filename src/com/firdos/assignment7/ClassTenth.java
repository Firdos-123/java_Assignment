package com.firdos.assignment7;
import java.util.Scanner;

public class ClassTenth {
	
	String studentName;
	int rollNo;
	String address;
	String subject;
	
	ClassTenth(){
		
		this.address ="Unknown";
		this.rollNo=0;
		this.studentName="Unknown";
		this.subject="Unknown";
	}
	public ClassTenth(String studentName,int rollNo,String address,String subject ) {
	
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.address=address;
		this.subject=subject;
		
	}
	public ClassTenth(String studentName,int rollNo) {
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.address="Unknown";
		this.subject="Unknown";
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void takeInput() {
		Scanner obj =new Scanner(System.in);
		
		System.out.println("Enter the name:");
		studentName=obj.nextLine();
		
		System.out.println("Enter the RollNo:");
		rollNo=obj.nextInt();
		obj.nextLine();
		
		System.out.println("Enter the Address:");
		address=obj.nextLine();
		
		System.out.println("Enter the Subject:");
		subject=obj.nextLine();
	
		
	}
	public void displayDetails() {
		System.out.println("Students Details:");
		System.out.println("Student Name:"+ studentName);
		System.out.println("Roll Number:"+ rollNo);
		System.out.println("Students Address:"+ address);
		System.out.println("Subjects:"+ subject);
		
	}
}
