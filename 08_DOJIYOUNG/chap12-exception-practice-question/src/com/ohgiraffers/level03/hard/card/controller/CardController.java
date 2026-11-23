package com.ohgiraffers.level03.hard.card.controller;

import com.ohgiraffers.level02.normal.order.model.dto.Inventory;
import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class CardController {
    private TransitCard card;  // 명령 처리할 카드

    public CardController(TransitCard card) {
        this.card = card;

    }

    /**
     * 먼저 명령 : <명령>를 출력한다.
     * 명령을 공백으로 나눠 앞 글자(충전·결제)와 금액 글자를 얻고,
     * 금액을 정수로 바꿔 charge 또는 pay를 부른다.
     * 성공하면 처리 완료를 출력한다.
     * 세 가지 예외를 각각 잡아 오류 줄을 출력하고,
     * finally로 잔액 : <N>원을 출력한다.*/
    public void process(String command) throws Exception{
        System.out.println("명령 : " + command);
        String[] sArr = command.split(" ");
        String act = sArr[0]; // 충전, 결제
        String bal = sArr[1];

        try {
            int b = Integer.parseInt(bal);
            if(act.equals("충전")){
                card.charge(b);
            }else{
                card.pay(b);
            }
        } catch (InsufficientBalanceException e1) {
            System.out.println(e1.getMessage());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e2) {
            System.out.println("금액은 숫자로 입력 ");
        }finally {
            System.out.println("잔액 : "+ card.getBalance());
        }
    }
}
