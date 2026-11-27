package com.ohgiraffers.section01.ocp.aipractice.solution;

/* 금액의 일정 비율(%)을 할인하는 정책. 할인 금액과 할인율이 같은 값(rate)에서 나오므로 서로 어긋날 수 없다. */
public class RateDiscountPolicy implements DiscountPolicy {

    private final int rate;

    public RateDiscountPolicy(int rate) {
        this.rate = rate;
    }

    @Override
    public int calculateDiscount(int amount) {
        return amount * rate / 100;
    }

    @Override
    public String rateText() {
        return rate + "%";
    }
}
