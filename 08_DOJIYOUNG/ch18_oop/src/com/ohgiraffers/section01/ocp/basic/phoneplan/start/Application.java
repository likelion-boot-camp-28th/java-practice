package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * 가입자를 Subscriber 목록에 담고, Billing에게 요금 합계를 구하게 한다.
         * 가입자마다 요금제 객체를 만들어 넘긴다. 마지막 값은 이번 달에 쓴 데이터(GB)다.
         * */
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(new Subscriber("정다은", new BasicPlan(), 3));
        subscribers.add(new Subscriber("한지우", new BasicPlan(), 8));
        subscribers.add(new Subscriber("오세린", new UnlimitedPlan(), 30));
        // TODO 단계 2: 알뜰 요금제 가입자 두 명을 목록에 넣는다
        subscribers.add(new Subscriber("윤가람", new SaverPlan(), 4));
        subscribers.add(new Subscriber("서도윤", new SaverPlan(), 15));

        Billing billing = new Billing();
        int total = billing.total(subscribers);
        System.out.println("요금 합계: " + total + "원");
    }
}