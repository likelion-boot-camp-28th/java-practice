package com.ohgiraffers.section01.ocp.basic.locker.start;

/* 비밀번호로 여는 사물함 하나를 나타내는 클래스다. */
public class Locker {

    // TODO 단계 3: 바깥 코드가 읽거나 바꾸지 못하게 password 필드를 private으로 바꾼다
    private String password;

    // 사물함을 만들 때 비밀번호를 받는다.
    public Locker(String password) {
        this.password = password;
    }

    // TODO 단계 1: input이 password와 같은지를 돌려주는 open(String input) 메소드를 만든다
    public boolean open(String input){
        boolean isSame = false;
        if(password.equals(input)){
            isSame = true;
        }
        return isSame;
    }
}