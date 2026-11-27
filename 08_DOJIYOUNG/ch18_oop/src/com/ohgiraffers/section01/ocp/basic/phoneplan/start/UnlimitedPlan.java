package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

/* 무제한 요금제다. 데이터를 얼마나 쓰든 59000원이다. */
public class UnlimitedPlan implements PhonePlan {

    public String getName() {
        return "무제한 요금제";
    }

    // usedGb를 쓰지 않지만, PhonePlan이 정한 모양과 같아야 구현이 되므로 받는다.
    public int fee(int usedGb) {
        return 59000;
    }
}