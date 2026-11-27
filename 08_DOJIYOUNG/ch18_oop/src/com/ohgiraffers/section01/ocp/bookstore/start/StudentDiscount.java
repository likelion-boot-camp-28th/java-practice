package com.ohgiraffers.section01.ocp.bookstore.start;

public class StudentDiscount implements DiscountPolicy{
    @Override
    public int discount(int amount) {
        return amount * 15 / 100;
    }
}
