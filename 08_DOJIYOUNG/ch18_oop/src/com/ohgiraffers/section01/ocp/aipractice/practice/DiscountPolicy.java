package com.ohgiraffers.section01.ocp.aipractice.practice;

public interface DiscountPolicy {

    int calculateDiscount(int amount);

    String discountRate();
}
