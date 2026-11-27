package com.ohgiraffers.section04.singleton.basic.kiosk.start;

/* 본사 가격표. 지금은 싱글톤이라 프로그램 전체에 하나뿐이다. */
public class PriceList {


    private int americano;

    public PriceList(int americano) {
        this.americano = americano;
    }


    public int americano() {
        return americano;
    }
}