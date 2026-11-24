package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

/*
 * 기본 요금제다. 데이터 5GB까지는 20000원이고,
 * 5GB를 넘으면 넘은 1GB마다 5000원을 더한다.
 * */
public class BasicPlan implements PhonePlan {

    public String getName() {
        return "기본 요금제";
    }

    public int fee(int usedGb) {

        if (usedGb <= 5) {
            return 20000;
        }
        return 20000 + (usedGb - 5) * 5000;
    }
}