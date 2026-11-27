package com.ohgiraffers.section01.ocp.aipractice.practice;

public class GoldDiscount implements DiscountPolicy {

    @Override
    public int calculateDiscount(int amount) {
        return amount * 5 / 100;
    }

    @Override
    public String discountRate() {
        return "5%";
    }
}
