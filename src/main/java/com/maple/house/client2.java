package com.maple.house;


public class client2 {

    public static void main(String[] args) {
        CalculateProfit fixationMontly = new CalculateProfit(300000,0.11,30);
        System.out.println("首付总收益  ："+ (int)fixationMontly.getAmountMoney());

        //月定投总收益
        FixationMontly fixationMontly1 = new FixationMontly(1000,0.08,30);
        System.out.println("月定投总收益："+(int)fixationMontly1.getTotal());
    }
}
