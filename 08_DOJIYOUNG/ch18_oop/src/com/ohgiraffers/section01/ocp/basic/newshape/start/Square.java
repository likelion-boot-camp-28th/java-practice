package com.ohgiraffers.section01.ocp.basic.newshape.start;

public class Square implements Shape{
    private int side; // 한변의 길이

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "정사각형";
    }

    @Override
    public int area() {
        return side*side;
    }
}
