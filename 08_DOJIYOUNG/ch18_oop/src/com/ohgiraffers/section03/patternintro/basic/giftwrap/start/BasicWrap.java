package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

public class BasicWrap implements Wrap{
    @Override
    public String label() {
        return "기본 포장";
    }

    @Override
    public int fee() {
        return 1000;
    }
}
