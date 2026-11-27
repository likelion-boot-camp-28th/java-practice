package com.ohgiraffers.section04.singleton.basic.kiosk.start;

public class Kiosk {

    private String store;
    private PriceList priceList;

    public Kiosk(String store, PriceList priceList) {
        this.store = store;
        this.priceList = priceList;
    }




    public String order(int cups) {
        int price = priceList.americano() * cups;
        return store + " 아메리카노 " + cups + "잔: " + price + "원";
    }
}