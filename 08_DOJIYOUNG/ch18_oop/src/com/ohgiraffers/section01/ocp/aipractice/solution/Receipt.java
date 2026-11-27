package com.ohgiraffers.section01.ocp.aipractice.solution;

/* 계산 결과를 담고 출력만 책임진다. */
public class Receipt {

    private final int orderNo;
    private final Customer customer;
    private final int amount;
    private final int discount;
    private final int shippingFee;

    public Receipt(int orderNo, Customer customer, int amount, int discount, int shippingFee) {
        this.orderNo = orderNo;
        this.customer = customer;
        this.amount = amount;
        this.discount = discount;
        this.shippingFee = shippingFee;
    }

    public int getPaymentAmount() {
        return amount - discount + shippingFee;
    }

    public void print() {
        System.out.println("[주문 " + orderNo + "] " + customer.getName());
        System.out.println("등급: " + customer.getGrade());
        System.out.println("주문 금액: " + amount);
        System.out.println("할인율: " + customer.getGrade().getDiscountPolicy().rateText());
        System.out.println("할인 금액: " + discount);
        System.out.println("배송비: " + shippingFee);
        System.out.println("결제 금액: " + getPaymentAmount());
        System.out.println("주문 결과: 완료");
    }
}
