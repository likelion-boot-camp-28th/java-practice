package com.ohgiraffers.section01.ocp.basic.device.start;

/* Device를 구현한 TV 클래스다. */
public class Tv implements Device {

    public void turnOff() {
        System.out.println("TV: 화면을 끈다");
    }
}