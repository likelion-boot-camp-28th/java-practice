package com.ohgiraffers.level01.basic.divide.controller;

public class Divider {
    //a를 b로 나눈 몫을 10 / 2 = 5 모양으로 출력한다.
    // 0으로 나누어 ArithmeticException이 나면 잡아서 0으로 나눌 수 없습니다.를 출력한다.
    // 성공하든 실패하든 마지막에 계산을 마칩니다.를 출력한다
    public void divide(int a, int b){
        try{
            System.out.println(a+ " / "+b +" = " + (a/b));
        }catch (ArithmeticException exception){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            System.out.println("계산을 마칩니다.");
        }

    }
}
