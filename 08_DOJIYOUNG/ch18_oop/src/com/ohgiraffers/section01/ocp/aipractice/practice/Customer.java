package com.ohgiraffers.section01.ocp.aipractice.practice;

public class Customer {

    private String name;
    private DiscountPolicy discountPolicy;

    public Customer(String name, DiscountPolicy discountPolicy) {
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }
}
