package com.maple.house;


public class client2 {

    public static void main(String[] args) {
        CalculateProfit fixationMontly = new CalculateProfit(5.8,0.08,15);
        System.out.println(fixationMontly.getAmountMoney());

        //月定投总收益
        FixationMontly fixationMontly1 = new FixationMontly(5000,0.08,30);
        System.out.println("月定投总收益："+fixationMontly1.getTotal());
    }
}
