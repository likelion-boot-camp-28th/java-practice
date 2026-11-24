package com.ohgiraffers.section01.ocp.basic.counter.start;

/* 방문자 수를 세는 클래스다. */
public class Counter {

    // TODO 단계 4: 바깥 코드가 바로 바꾸지 못하게 count 필드를 private으로 바꾼다
    private int count;

    // TODO 단계 1: count를 1 늘리는 increase() 메소드를 만든다
    public void increase(){
        this.count++;
    }

    // TODO 단계 2: count 값을 돌려주는 getCount() 메소드를 만든다
    public int getCount(){
        return this.count;
    }
}