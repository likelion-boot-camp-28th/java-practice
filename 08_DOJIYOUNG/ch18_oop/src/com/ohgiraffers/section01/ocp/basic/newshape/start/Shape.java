package com.ohgiraffers.section01.ocp.basic.newshape.start;

/*
 * 도형이 반드시 가져야 할 메소드를 정한 인터페이스다.
 * 도형마다 계산식은 달라도 이름과 넓이를 돌려주는 방법은 같으므로
 * 이 타입 하나로 묶을 수 있다.
 * */
public interface Shape {

    String getName();

    int area();
}