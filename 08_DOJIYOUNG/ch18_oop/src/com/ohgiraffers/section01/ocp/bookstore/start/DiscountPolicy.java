package com.ohgiraffers.section01.ocp.bookstore.start;

public interface DiscountPolicy {
    // 상품 금액을 받아 할인 금액 돌려주는
    int discount(int amount);
}
