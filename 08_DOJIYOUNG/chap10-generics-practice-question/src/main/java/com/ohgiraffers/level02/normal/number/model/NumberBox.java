package com.ohgiraffers.level02.normal.number.model;

public class NumberBox <T extends Number>{

    private T first;
    private T second;

    public NumberBox(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // 두 값을 double로 바꿔 더한 값을 반환한다.
    public double sum(){
        double a = (this.first).doubleValue();
        double b = (this.second).doubleValue();
        return (double)a+b;
    }

    public boolean isFistBigger(){
        double a = (this.first).doubleValue();
        double b = (this.second).doubleValue();
        return (a>b)?true:false;
    }
}
