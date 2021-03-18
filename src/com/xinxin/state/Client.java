package com.xinxin.state;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(2);

        for (int i = 0; i < 30; ++ i) {
            System.out.println("================" + i + "===============");
            activity.deductMoney();

            activity.raffle();
        }
    }
}
