package com.eyepoppy;

public class TaxCalculator2019 implements TaxCalculator{
    @Override
    public float calculateTax() {//interface
        return 1;
    }

    public float calculateInsurance(){//not interface
        return 0;
    }
}
