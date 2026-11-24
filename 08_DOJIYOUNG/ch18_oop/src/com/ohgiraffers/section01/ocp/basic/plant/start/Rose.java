package com.ohgiraffers.section01.ocp.basic.plant.start;

/* 장미 화분 클래스다. 장미는 물을 많이 준다. */
public class Rose implements Plant{

    // TODO 단계 2: 클래스 선언에 implements Plant를 붙인다
    private String place;

    // place는 화분을 둔 자리다. 같은 장미라도 자리로 구별한다.
    public Rose(String place) {
        this.place = place;
    }

    public void water() {
        System.out.println(place + " 장미: 물 300ml");
    }
}