package com.ohgiraffers.level03.hard.card.model.dto;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;

public class TransitCard {
    private int balance;

    public TransitCard(int balance) {
        this.balance = balance;
    }

    public void charge(int amount) throws InvalidAmountException {
        if (amount <= 0){
            throw new InvalidAmountException("금액은 0보다 커야합니다: " + amount);
        }else{
            balance += amount;
        }
    }

    public void pay(int fare) throws InsufficientBalanceException {
        if (fare <= 0 ){
            throw new InvalidAmountException("금액은 0보다 커야 합니다: " + fare);
        }
        if (balance < fare) {
            throw new InsufficientBalanceException("잔액이 부족합니다. 결제 금액: " + fare + "원");
        }else {
            balance -= fare;
        }
    }

    public int getBalance(){return balance;}
}
