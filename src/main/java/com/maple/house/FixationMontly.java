package com.maple.house;

public class FixationMontly {

    private double paymentMonthly;
    private double rateYearly;
    private int years;

    public FixationMontly(double paymentMonthly, double rateYearly, int years) {
        this.paymentMonthly = paymentMonthly;
        this.rateYearly = rateYearly;
        this.years = years;
    }

    public double getTotal(){
        double total = 0;
        for (int i = 1; i <= years*12; i++) {
            int months = years*12 - (i-1);
            int integerYears = months/12;
            double amount = paymentMonthly;
            double residueYear = (months - integerYears*12)/12.0 == 0? 1:(months - integerYears*12)/12.0;
            for (int j = 1; j <= integerYears; j++) {
                if(j != integerYears){
                    amount = amount*(rateYearly+1);
                }else{
                    amount = amount*(rateYearly)*residueYear + amount;
                }
//                System.out.println("第"+i+"月，第"+j+"年投资总回报"+amount);
            }
//            System.out.println("第"+i+"月投资总回报"+amount);
            total += amount;
        }
        return total;
    }
}
