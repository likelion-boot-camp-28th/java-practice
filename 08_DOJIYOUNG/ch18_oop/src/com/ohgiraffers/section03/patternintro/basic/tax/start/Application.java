package com.ohgiraffers.section03.patternintro.basic.tax.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 부가세 10%를 더한 가격을 출력한다. 세금 계산 방법은 부가세 하나뿐이다.
         * 「나중에 다른 세금이 생길지도 몰라서」 인터페이스와 객체를 만드는 클래스를 미리 두었다.
         * */
        // TODO 단계 1: 같은 패키지에 부가세를 더한 가격을 돌려주는 withTax(int price) 메소드를 가진 TaxCalculator 클래스를 만든다
        TaxCalculator tc = new TaxCalculator();
        // TODO 단계 2: 아래 세 줄이 TaxFactory 대신 TaxCalculator를 쓰게 바꾼다
        //Tax tax = TaxFactory.create();
        System.out.println("책 15000원 → 세금 포함 " + tc.withTax(15000) + "원");
        System.out.println("펜 2300원 → 세금 포함 " +  tc.withTax(2300) + "원");
    }
}