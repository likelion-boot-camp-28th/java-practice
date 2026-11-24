package com.ohgiraffers.section01.ocp.basic.device.start;

/* 에어컨 클래스다. */
public class AirConditioner implements Device{

    // TODO 단계 1: 클래스 선언에 implements Device를 붙인다
    public void turnOff() {
        System.out.println("에어컨: 바람을 멈춘다");
    }
}