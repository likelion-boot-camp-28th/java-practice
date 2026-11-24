package com.ohgiraffers.section01.ocp.basic.phoneplan.start;

/* 가입자 한 명의 이름, 요금제, 이번 달에 쓴 데이터를 담는 클래스다. */
public class Subscriber {

    private String name;
    // 필드의 타입이 인터페이스이므로 PhonePlan을 구현한 어느 요금제 객체든 담을 수 있다.
    private PhonePlan plan;
    private int usedGb;

    public Subscriber(String name, PhonePlan plan, int usedGb) {
        this.name = name;
        this.plan = plan;
        this.usedGb = usedGb;
    }

    public String getName() {
        return name;
    }

    public PhonePlan getPlan() {
        return plan;
    }

    public int getUsedGb() {
        return usedGb;
    }
}