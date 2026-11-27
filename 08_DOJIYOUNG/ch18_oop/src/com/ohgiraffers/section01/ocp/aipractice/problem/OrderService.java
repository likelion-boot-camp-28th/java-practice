package com.ohgiraffers.section01.ocp.aipractice.problem;

public class OrderService {

    public int calculateDiscount(Customer customer, int amount) {

        if (customer.getGrade().equals("VIP")) {
            return amount * 10 / 100;
        } else if (customer.getGrade().equals("GOLD")) {
            return amount * 5 / 100;
        }
        return 0;
    }

    public String discountRate(Customer customer) {

        if (customer.getGrade().equals("VIP")) {
            return "10%";
        } else if (customer.getGrade().equals("GOLD")) {
            return "5%";
        }
        return "0%";
    }

    public int shippingFee(int amount) {

        if (amount >= 30000) {
            return 0;
        }
        return 3000;
    }
    public void printOrder(int no, Customer customer, int amount) {

        int discount = calculateDiscount(customer, amount);
        int fee = shippingFee(amount - discount);
        System.out.println("[주문 " + no + "] " + customer.getName());
        System.out.println("결제 금액: " + (amount - discount + fee));
        System.out.println("배송비: " + fee);
        System.out.println("할인 금액: " + discount);
        System.out.println("등급: " + customer.getGrade());
        System.out.println("할인율: " + discountRate(customer));
        System.out.println("주문 결과: 완료");
    }
}