package com.company;

public class LuckysumSimulator {
    public static void main(String[] args) {
        LuckySum ls = new LuckySum();
        System.out.println(ls.luckySum(1, 2, 3));
        System.out.println(ls.luckySum(1, 2, 13));
        System.out.println(ls.luckySum(1, 13, 3));
    }
}
