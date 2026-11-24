package com.ohgiraffers.section01.ocp.basic.shape.start;

/* 밑변과 높이로 넓이를 계산하는 삼각형 클래스다. */
public class Triangle implements Shape{

    // TODO 단계 3: 클래스 선언에 implements Shape를 붙이고 "삼각형"을 돌려주는 getName()을 만든다
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    // 정수끼리 나누므로 소수점 아래는 버려진다.
    public int area() {
        return base * height / 2;
    }
}