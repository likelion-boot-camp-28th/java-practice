package com.ohgiraffers.section01.ocp.basic.admission.start;

public class Teen implements AgeGroup{
    @Override
    public String getName() {
        return "청소년";
    }

    @Override
    public int getFee() {
        return 10000;
    }
}
