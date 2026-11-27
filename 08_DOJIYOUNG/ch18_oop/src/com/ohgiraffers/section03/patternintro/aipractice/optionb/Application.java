package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class Application {

    public static void main(String[] args) {

        /* 구조 B: 머리글 모양을 HeaderFormat 인터페이스와 구현 클래스 두 개로 나눴다. 실제로 쓰는 것은 LineHeader 하나다. */
        ReceiptPrinter printer = new ReceiptPrinter(new LineHeader());

        printer.print("BK-0001", 32400);
        printer.print("BK-0002", 23900);
    }
}