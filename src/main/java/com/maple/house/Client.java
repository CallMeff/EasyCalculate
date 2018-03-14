package com.maple.house;

public class Client {

    public static void main(String[] args) {

        double rate = 0.0515;                 //个人理财年化收益
        double aheadPayMent = 400000;       //首付
        double lastPayMent = 100000;        //剩余还款
        int years = 30;                     //贷款年限
        double monthlyPayMent = 545.83;       //月供

        //银行还款总额
        CalculateHouse calculateHouse = new CalculateHouse(aheadPayMent,monthlyPayMent,years);
        System.out.println("银行还款总额：" + calculateHouse.getAmountPayment());

        //月定投总收益
        FixationMontly fixationMontly = new FixationMontly(monthlyPayMent,rate,years);
        System.out.println("月定投总收益："+fixationMontly.getTotal());

        //投资总收益
        CalculateProfit calculateProfit = new CalculateProfit(lastPayMent,rate,years);
        System.out.println("剩余还款投资总收益：" + calculateProfit.getAmountMoney());
    }
}
