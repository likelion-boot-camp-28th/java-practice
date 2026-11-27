package com.ohgiraffers.section03.patternintro.aipractice.optiona;

public class Application {

    public static void main(String[] args) {

        /* 구조 A: 머리글은 ReceiptPrinter의 메소드 하나가 만든다. */
        ReceiptPrinter printer = new ReceiptPrinter();

        printer.print("BK-0001", 32400);
        printer.print("BK-0002", 23900);
    }
}