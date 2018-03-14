package com.maple.house;

public class CalculateHouse {

    private double aheadPayment;//首付
    private double monthlyPayment;//月供
    private double years;//贷款年限

    public CalculateHouse(double aheadPayment, double monthlyPayment, double years) {
        this.aheadPayment = aheadPayment;
        this.monthlyPayment = monthlyPayment;
        this.years = years;
    }

    public double getAmountPayment(){
        return (monthlyPayment * years * 12) + aheadPayment;
    }
}
