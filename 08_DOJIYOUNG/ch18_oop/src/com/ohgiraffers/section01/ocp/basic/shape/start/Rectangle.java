package com.ohgiraffers.section01.ocp.basic.shape.start;

/* 가로와 세로로 넓이를 계산하는 사각형 클래스다. */
public class Rectangle implements Shape{

    // TODO 단계 2: 클래스 선언에 implements Shape를 붙이고 "사각형"을 돌려주는 getName()을 만든다
    private int width;
    private int height;

    /*
     * 생성자는 new로 객체를 만들 때 실행되는 코드이고, 이름이 클래스 이름과 같다.
     * this.width는 이 객체의 필드이고, width는 넘겨받은 매개변수다.
     * 이름이 같으므로 this를 붙여 구별한다.
     * */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    public int area() {
        return width * height;
    }
}