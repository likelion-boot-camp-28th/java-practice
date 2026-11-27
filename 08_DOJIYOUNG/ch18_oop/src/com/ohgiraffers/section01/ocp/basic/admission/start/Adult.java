package com.ohgiraffers.section01.ocp.basic.admission.start;

public class Adult implements AgeGroup{
    @Override
    public String getName() {
        return "어른";
    }

    @Override
    public int getFee() {
        return 15000;
    }
}
