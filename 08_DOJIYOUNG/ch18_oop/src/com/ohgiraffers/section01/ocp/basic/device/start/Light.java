package com.ohgiraffers.section01.ocp.basic.device.start;

public class Light implements Device{
    @Override
    public void turnOff() {
        System.out.println("조명: 불을 끈다.");
    }
}
