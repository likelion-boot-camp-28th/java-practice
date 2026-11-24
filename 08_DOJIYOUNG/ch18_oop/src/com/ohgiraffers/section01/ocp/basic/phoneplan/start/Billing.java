package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

import java.util.List;

/*
 * 가입자마다 요금을 계산해 출력하고, 요금 합계를 돌려주는 클래스다.
 * 요금제를 PhonePlan으로만 적었으므로 이 파일에는 요금제 클래스 이름이 없다.
 * */
public class Billing {

    public int total(List<Subscriber> subscribers) {

        int total = 0;
        for (Subscriber subscriber : subscribers) {
            PhonePlan plan = subscriber.getPlan();
            int fee = plan.fee(subscriber.getUsedGb());
            System.out.println(subscriber.getName() + " " + plan.getName()
                    + " " + subscriber.getUsedGb() + "GB: " + fee + "원");
            total = total + fee;
        }
        return total;
    }
}