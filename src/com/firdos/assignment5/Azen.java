package com.firdos.assignment5;

public class Azen extends TaxPayers {

    public Azen(double salary) {
        super(salary);
    }

    public double calculateTax() {
        if (salary <= 50000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
