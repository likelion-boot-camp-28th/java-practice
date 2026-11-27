package com.ohgiraffers.section01.ocp.basic.device.start;

/*
 * 전원을 끌 수 있는 가전을 나타내는 인터페이스다.
 * 어떻게 끄는지는 가전마다 다르므로 구현 클래스가 정한다.
 * */
public interface Device {

    void turnOff();
}