package com.ohgiraffers.section01.ocp.basic.elevator.start;

/* 엘리베이터 한 대를 나타내는 클래스다. */
public class Elevator {

    // 엘리베이터 이름과 지금 있는 층이다.
    String name;
    int floor;

    public Elevator(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }

    // TODO 단계 1: 이동하는 줄을 출력하고 floor를 target으로 바꾸는 moveTo(int target) 메소드를 만든다
    public void moveTo(int target){
        if(target==floor){
            System.out.println("이미 "+floor+"층");
            return;
        }
        System.out.println(name+" : "+floor+"층 → "+target+"층");
        floor = target;
    }
}