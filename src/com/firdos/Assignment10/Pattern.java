package com.firdos.Assignment10;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the row");
        n=ob.nextInt();
        // Number of rows in the pattern
        
        // Outer loop for rows
        for (int i = 1; i <=n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print stars or any desired character
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

	
	
	
	
