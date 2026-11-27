package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

public class SaverPlan implements  PhonePlan{
    @Override
    public String getName() {
        return "알뜰요금제";
    }

    @Override
    public int fee(int usedGb) {
        int amount =usedGb*3000;

        if(amount >30000){
            amount = 30000;
        }
        return amount;
    }
}
