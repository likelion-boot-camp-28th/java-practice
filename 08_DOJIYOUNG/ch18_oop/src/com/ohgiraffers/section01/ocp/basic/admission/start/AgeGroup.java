package com.ohgiraffers.section01.ocp.basic.admission.start;

/*
 * 연령대마다 달라지는 두 가지(이름, 입장료)를 정한 인터페이스다.
 * 합계를 계산하는 코드는 이 인터페이스의 메소드만 부른다.
 * */
public interface AgeGroup {

    String getName();

    int getFee();
}