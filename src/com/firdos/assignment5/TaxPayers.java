package com.firdos.assignment5;

public abstract class TaxPayers {
    protected double salary;

    public TaxPayers(double salary) {
        this.salary = salary;
    }

    public abstract double calculateTax();

    public void displayTax() {
        System.out.println("The tax to be paid is: " + calculateTax());
    }
}