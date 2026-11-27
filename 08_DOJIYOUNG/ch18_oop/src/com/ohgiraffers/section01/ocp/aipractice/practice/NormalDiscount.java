package com.ohgiraffers.section01.ocp.aipractice.practice;

public class NormalDiscount implements DiscountPolicy {

    @Override
    public int calculateDiscount(int amount) {
        return 0;
    }

    @Override
    public String discountRate() {
        return "0%";
    }
}
