package com.ohgiraffers.section01.ocp.aipractice.solution;

/* 등급과 할인 정책을 한 곳에서 짝지어 둔다. 등급 추가 시 OrderService는 수정할 필요가 없다. */
public enum Grade {

    VIP(new RateDiscountPolicy(10)),
    GOLD(new RateDiscountPolicy(5)),
    NORMAL(new RateDiscountPolicy(0));

    private final DiscountPolicy discountPolicy;

    Grade(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }
}
