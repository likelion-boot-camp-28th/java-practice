package com.ohgiraffers.section01.ocp.basic.newshape.start;

/*
 * Shape를 구현한 사각형 클래스다.
 * Shape의 메소드(getName, area)를 모두 가지고 있다.
 * */
public class Rectangle implements Shape {

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

    // 인터페이스의 메소드는 저절로 public이므로 여기에도 public을 붙인다.
    public String getName() {
        return "사각형";
    }

    public int area() {
        return width * height;
    }
}