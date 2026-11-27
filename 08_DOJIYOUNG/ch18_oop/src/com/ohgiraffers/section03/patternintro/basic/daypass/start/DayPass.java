package com.ohgiraffers.section03.patternintro.basic.daypass.start;

public class DayPass implements Pass {
    private String owner;

    public DayPass(String owner) {
        this.owner = owner;
    }
    @Override
    public boolean use(String where) {
        System.out.println(owner + " " + where + " 입장,1인권");
        return true;
    }
}
