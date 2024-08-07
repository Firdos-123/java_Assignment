package com.firdos.assignment3;

public class Main {
    public static void main(String[] args) {
        Continent asia = new Continent("Asia");
        Country india = new Country("India", "Hindi", "INR", "New Delhi");
        State maharashtra = new State("Maharashtra", "Marathi", "INR", "Mumbai");

        System.out.println(asia);
        System.out.println(india);
        System.out.println(maharashtra);
    }
}
