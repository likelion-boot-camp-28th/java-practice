package com.ohgiraffers.section03.patternintro.aipractice.optiona;

public class ReceiptPrinter {

    public void print(String orderNo, int amount) {
        System.out.println(header());
        System.out.println("주문 번호: " + orderNo);
        System.out.println("결제 금액: " + amount);
    }

    private String header() {
        return "==== 서점 영수증 ====";
    }
}