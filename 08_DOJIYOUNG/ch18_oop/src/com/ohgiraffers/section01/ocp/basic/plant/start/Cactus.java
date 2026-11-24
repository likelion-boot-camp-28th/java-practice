package com.ohgiraffers.section01.ocp.basic.plant.start;

/* 선인장 화분 클래스다. 선인장은 물을 조금 준다. */
public class Cactus implements Plant{

    // TODO 단계 3: 클래스 선언에 implements Plant를 붙인다
    private String place;

    public Cactus(String place) {
        this.place = place;
    }

    public void water() {
        System.out.println(place + " 선인장: 물 50ml");
    }
}