package com.ohgiraffers.section03.patternintro.basic.daypass.start;

public class MonthPass implements Pass {

    private String owner;

    public MonthPass(String owner) {
        this.owner = owner;
    }

    public boolean use(String where) {
        System.out.println(owner + " " + where + " 입장, 월 회원권");
        return true;
    }
}