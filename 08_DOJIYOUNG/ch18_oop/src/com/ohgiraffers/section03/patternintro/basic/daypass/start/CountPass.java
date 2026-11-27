package com.ohgiraffers.section03.patternintro.basic.daypass.start;

public class CountPass implements Pass {

    private String owner;
    private int remaining;

    public CountPass(String owner, int remaining) {
        this.owner = owner;
        this.remaining = remaining;
    }

    public boolean use(String where) {

        if (remaining <= 0) {
            System.out.println(owner + " 입장 불가: 남은 횟수 없음");
            return false;
        }
        remaining = remaining - 1;
        System.out.println(owner + " " + where + " 입장, 남은 횟수: " + remaining);
        return true;
    }
}