package com.firdos.assignment5;

public class Kaif extends TaxPayers {

    public Kaif(double salary) {
        super(salary);
    }

    public double calculateTax() {
        return salary * 0.15;
    }
}
