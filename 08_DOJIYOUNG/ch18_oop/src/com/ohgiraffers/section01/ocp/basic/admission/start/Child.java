package com.ohgiraffers.section01.ocp.basic.admission.start;

/* 어린이 연령대를 맡는 클래스다. 이름과 입장료가 이 클래스 한 곳에 있다. */
public class Child implements AgeGroup {

    public String getName() {
        return "어린이";
    }

    public int getFee() {
        return 8000;
    }
}