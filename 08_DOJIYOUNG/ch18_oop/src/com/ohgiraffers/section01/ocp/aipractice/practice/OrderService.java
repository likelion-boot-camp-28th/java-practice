package com.ohgiraffers.section01.ocp.aipractice.practice;

public class OrderService {

    public int shippingFee(int amount) {
        if (amount >= 30000) {
            return 0;
        }
        return 3000;
    }

    public void printOrder(int no, Customer customer, int amount) {

        DiscountPolicy policy = customer.getDiscountPolicy();
        int discount = policy.calculateDiscount(amount);
        int fee = shippingFee(amount - discount);

        System.out.println("[주문 " + no + "] " + customer.getName());
        System.out.println("결제 금액: " + (amount - discount + fee));
        System.out.println("배송비: " + fee);
        System.out.println("할인 금액: " + discount);
        System.out.println("할인율: " + policy.discountRate());
        System.out.println("주문 결과: 완료");
    }
}
