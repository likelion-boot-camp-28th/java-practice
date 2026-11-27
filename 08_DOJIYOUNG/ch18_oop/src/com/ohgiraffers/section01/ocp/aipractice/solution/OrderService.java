package com.ohgiraffers.section01.ocp.aipractice.solution;

/* 계산만 책임진다. 등급별 if-else가 사라져 등급/할인 정책이 늘어도 수정할 필요가 없다. */
public class OrderService {

    private static final int FREE_SHIPPING_THRESHOLD = 30000;
    private static final int SHIPPING_FEE = 3000;

    public Receipt order(int orderNo, Customer customer, int amount) {

        int discount = customer.getGrade().getDiscountPolicy().calculateDiscount(amount);
        int fee = shippingFee(amount - discount);   // 기존 동작 유지: 할인 후 금액 기준
        return new Receipt(orderNo, customer, amount, discount, fee);
    }

    private int shippingFee(int amount) {
        return amount >= FREE_SHIPPING_THRESHOLD ? 0 : SHIPPING_FEE;
    }
}
