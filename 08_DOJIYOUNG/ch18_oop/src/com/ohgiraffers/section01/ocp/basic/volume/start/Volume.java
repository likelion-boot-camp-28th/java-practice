package com.ohgiraffers.section01.ocp.basic.volume.start;

/* 스피커 음량 조절기 하나를 나타내는 클래스다. 음량은 0부터 10까지만 쓴다. */
public class Volume {

    // TODO 단계 5: 바깥 코드가 바로 바꾸지 못하게 level 필드를 private으로 바꾼다
    private int level;


    // TODO 단계 1: level이 10보다 작을 때만 1 늘리는 up() 메소드를 만든다
    public void up(){
        if(level<10){
            level++;
        }
    }


    // TODO 단계 2: level이 0보다 클 때만 1 줄이는 down() 메소드를 만든다
    public void down(){
        if(level>0){
            level--;
        }
    }

    // TODO 단계 3: level 값을 돌려주는 getLevel() 메소드를 만든다
    public int getLevel(){
        return level;
    }
}