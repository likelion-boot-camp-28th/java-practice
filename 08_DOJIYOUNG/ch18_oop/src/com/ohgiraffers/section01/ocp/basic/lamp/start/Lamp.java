package com.ohgiraffers.section01.ocp.basic.lamp.start;

/* 전구 하나를 나타내는 클래스다. */
public class Lamp {

    // TODO 단계 1: 전구 이름 String name과 밝기 int brightness 필드를 만든다
    private String name;
    private int brightness;

    public Lamp(String name, int brightness) {
        this.name = name;
        this.brightness = brightness;
    }

    // TODO 단계 2: 밝기를 value로 바꾸는 turnOn(int value) 메소드를 만든다
    public void turnOn(int value){
        this.brightness = value;
    }
}
