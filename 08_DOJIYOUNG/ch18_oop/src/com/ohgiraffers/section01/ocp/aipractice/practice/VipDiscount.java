package com.ohgiraffers.section01.ocp.aipractice.practice;

public class VipDiscount implements DiscountPolicy {

    @Override
    public int calculateDiscount(int amount) {
        return amount * 10 / 100;
    }

    @Override
    public String discountRate() {
        return "10%";
    }
}
