package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

public class BoxWrap implements Wrap{
    @Override
    public String label() {
        return "상자포장";
    }

    @Override
    public int fee() {
        return 5000;
    }
}
