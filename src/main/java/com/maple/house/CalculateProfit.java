package com.maple.house;


public class CalculateProfit {

    private double amount;//总额
    private double interest;//利息
    private double years;//年限

    public CalculateProfit(double amount, double interest, double years) {
        this.years = years - 1;
        this.amount = amount;
        this.interest = interest;
    }

    public double getAmountMoney(){
        double rate = 1+interest;
        interest = rate;
//        System.out.println("总额："+amount);
        for (int i=0;i<years;i++){
            interest = interest*rate;
//            System.out.println("第"+(i+1)+"年："+interest*amount);
        }
        return amount*interest;
    }
}
