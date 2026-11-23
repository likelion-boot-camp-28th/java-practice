package com.ohgiraffers.level02.normal.age.exception;

public class InvalidAgeException extends Exception{

    /**
     * 받은 메시지를 부모 클래스 Exception의 생성자에 넘긴다.
     * 그래야 getMessage()가 그 메시지를 반환한다.
     */

    // 생성자
    public InvalidAgeException(String message){
            super(message);
    }
}
