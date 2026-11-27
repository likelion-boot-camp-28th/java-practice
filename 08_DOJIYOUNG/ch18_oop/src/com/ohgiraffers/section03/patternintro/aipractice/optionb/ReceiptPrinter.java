package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class ReceiptPrinter {

    private static final String TITLE = "서점 영수증";

    private HeaderFormat headerFormat;

    public ReceiptPrinter(HeaderFormat headerFormat) {
        this.headerFormat = headerFormat;
    }

    public void print(String orderNo, int amount) {
        System.out.println(headerFormat.header(TITLE));
        System.out.println("주문 번호: " + orderNo);
        System.out.println("결제 금액: " + amount);
    }
}