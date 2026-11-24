package com.ohgiraffers.section01.ocp.bookstore.start;

public class NoDiscount implements DiscountPolicy{
    @Override
    public int discount(int amount) {
        return amount * 15 / 100;
    }
}
