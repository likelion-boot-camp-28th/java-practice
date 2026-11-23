package com.ohgiraffers.level02.normal.age.controller;

import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

public class AgeValidator {

    /**
     * 나이가 0보다 작거나 150보다 크면
     * 나이는 0~150 사이여야 합니다: <나이> 메시지로 InvalidAgeException을 던진다.
     * 메소드 선언에 throws InvalidAgeException을 붙인다. 출력은 하지 않는다.
     */
    public void check(int age) throws InvalidAgeException {
            if(age<0 || age>150){
                throw new InvalidAgeException("나이는 0~150 사이여야 합니다 : "+age);
            }
    }
}
