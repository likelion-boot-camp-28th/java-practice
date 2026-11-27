package com.ohgiraffers.section04.singleton.basic.kiosk.start;

public class Application {

    public static void main(String[] args) {

        /* 공항점은 아메리카노를 5500원에 판다. 그러나 두 지점이 본사 가격표 하나를 함께 쓴다. */
        Kiosk gangnam = new Kiosk("강남점", new PriceList(4500));
        Kiosk airport = new Kiosk("공항점", new PriceList(5500));

        System.out.println(gangnam.order(2));
        System.out.println(airport.order(2));
    }
}