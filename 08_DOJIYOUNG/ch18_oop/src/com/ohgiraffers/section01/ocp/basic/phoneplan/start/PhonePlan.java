package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

/*
 * 휴대폰 요금제가 반드시 가져야 할 메소드를 정한 인터페이스다.
 * 요금을 계산하는 규칙은 요금제마다 다르므로 구현 클래스가 정한다.
 * */
public interface PhonePlan {

    String getName();

    // 한 달 동안 쓴 데이터(GB)를 받아 그달 요금(원)을 돌려준다.
    int fee(int usedGb);
}