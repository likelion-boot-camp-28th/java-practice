package com.ohgiraffers.level03.hard.card.model.dto;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;

public class TransitCard {
    private int balance;

    public TransitCard(int balance) {
        this.balance = balance;
    }

    /**금액이 0 이하이면 InvalidAmountException을 던진다..*/
    public void charge(int amount) throws Exception{
        if(amount<0){
            throw new InvalidAmountException("금액 0원 이하");
        }else{
            balance+=amount;
        }
    }

    /**금액이 0 이하이면 InvalidAmountException을 던진다.
     * 잔액이 요금보다 적으면 InsufficientBalanceException을 던지고, 그렇지 않으면 잔액에서 뺀다.
     * 선언에 throws InsufficientBalanceException을 붙인다. 출력은 하지 않는다.*/
    public void pay(int fare) throws  Exception {
        if(fare<0){
            throw  new InvalidAmountException("금액 0원 이하");
        }else if(fare>balance){
            throw  new InsufficientBalanceException("잔액 부족");
        }else{
            balance-=fare;
        }
    }

    public int getBalance(){
        return balance;
    }
}
