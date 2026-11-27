package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

public class PremiunWrap implements Wrap{
    @Override
    public String label() {
        return "고급포장";
    }

    @Override
    public int fee() {
        return 3000;
    }
}
