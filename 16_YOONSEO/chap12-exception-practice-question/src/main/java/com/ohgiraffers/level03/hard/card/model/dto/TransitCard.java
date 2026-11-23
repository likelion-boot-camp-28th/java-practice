package com.ohgiraffers.level03.hard.card.model.dto;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;

public class TransitCard {

    private int balance;    // 잔액

    // 기본생성자
    public TransitCard() {
    }

    /**
     * 금액이 0 이하이면 InvalidAmountException을 던진다.
     * 그렇지 않으면 잔액에 더한다.
     * 출력은 하지 않는다.
     */
    public void charge(int amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("금액은 0보다 커야 합니다 : " + amount+"원");
        } else {
            balance += amount;
        }

    }

    /**
     * 금액이 0 이하이면 InvalidAmountException을 던진다.
     * 잔액이 요금보다 적으면 InsufficientBalanceException을 던지고,
     * 그렇지 않으면 잔액에서 뺀다.
     * 선언에 throws InsufficientBalanceException을 붙인다.
     * 출력은 하지 않는다.
     */
    public void pay(int fare) throws InsufficientBalanceException {
        if (balance < fare) {
            throw new InsufficientBalanceException("잔액이 부족합니다. 결제 금액: "+fare+"원");
        } else {
            balance -= fare;
        }
    }


    public int getBalance() {
        return balance;
    }
}
