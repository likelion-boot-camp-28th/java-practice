package com.ohgiraffers.section01.ocp.aipractice.solution;

/* 할인 정책의 추상화. 새 할인 방식이 생기면 이 인터페이스를 구현한 클래스만 추가한다. */
public interface DiscountPolicy {

    int calculateDiscount(int amount);

    String rateText();
}
