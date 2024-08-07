package com.firdos.assignment8;

import java.util.Scanner;

public class NestedClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("The first number to divide:");
            int num1 = scanner.nextInt();

            System.out.println("The second number to divide:");
            int num2 = scanner.nextInt();

            class Divider {
                public int divide(int a, int b) {
                    return a / b;
                }
            }

            Divider divider = new Divider();
            int result = divider.divide(num1, num2);
            System.out.println("The result of the division is: " + result);

            try {
                // Nested try block to handle array index exception
                int[] arr = new int[2];
                int num = arr[5]; // This will throw ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught in nested catch: " + e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("The program is completed");
            scanner.close();
        }
    }
}
