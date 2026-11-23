package com.ohgiraffers.level03.hard.card.controller;

import com.ohgiraffers.level03.hard.card.exception.InsufficientBalanceException;
import com.ohgiraffers.level03.hard.card.exception.InvalidAmountException;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class CardController {

    // 명령을 처리할 카드
    private TransitCard card;

    public CardController(TransitCard card) {
        this.card = card;
    }

    /**
     * 먼저 명령 : <명령>를 출력한다.
     * 명령을 공백으로 나눠 앞 글자(충전·결제)와 금액 글자를 얻고,
     * 금액을 정수로 바꿔 charge 또는 pay를 부른다.
     * 성공하면 처리 완료를 출력한다.
     * 세 가지 예외를 각각 잡아 오류 줄을 출력하고, finally로 잔액 : <N>원을 출력한다.
     */
    public void process(String command) {
        System.out.print("명령 : " + command);

        try {
            String[] str = command.split(" ");
            int num = Integer.parseInt(str[1]);
            if (str[0].equals("충전")) {
                card.charge(num);
                System.out.println();
            } else if (str[0].equals("결제")) {
                card.pay(num);
                System.out.println();
            }
                System.out.println("처리 완료");

        } catch (NumberFormatException e) {
            System.out.println();
            System.out.println("금액은 숫자로 입력해야 합니다.");
        } catch (InvalidAmountException e) {
            System.out.println();
            System.out.println(e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("잔액 : " + card.getBalance() + "원");
        }
    }
}
