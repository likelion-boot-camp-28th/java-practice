package com.ohgiraffers.section01.ocp.basic.newshape.start;

/* Shape를 구현한 삼각형 클래스다. 모양은 Rectangle과 같고 계산식이 다르다. */
public class Triangle implements Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "삼각형";
    }

    // 정수끼리 나누므로 소수점 아래는 버려진다.
    public int area() {
        return base * height / 2;
    }
}