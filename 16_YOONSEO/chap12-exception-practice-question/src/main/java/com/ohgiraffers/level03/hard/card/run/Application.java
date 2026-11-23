package com.ohgiraffers.level03.hard.card.run;

import com.ohgiraffers.level03.hard.card.controller.CardController;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class Application {
    public static void main(String[] args) {

        /**
         * 교통카드 충전과 결제에 대한 프로그램이다.
         * "충전 5000, 결제 1450"처럼 글자로 된 명령을 차례로 처리한다.
         * 금액이 0 이하이면 unchecked 예외,
         * 잔액이 모자라면 checked 예외,
         * 금액이 숫자가 아니면 JDK 예외가 나고,
         * 세 경우를 구분해 처리한 뒤 다음 명령을 계속 처리함
         */

        // 1. 잔액 0원인 TransitCard와 CardController를 만든다
        TransitCard transitCard = new TransitCard();
        CardController cardController = new CardController(transitCard);

        // 2. 처리할 명령 배열을 만든다
        String[] str = {"충전 5000", "결제 1450", "결제 abc", "충전 -1000", "결제 9000", "충전 10000", "결제 1450"};

        // 3. 명령을 하나씩 처리한다
        for(int i=0; i<str.length; i++){
            cardController.process(str[i]);
        }

    }

}
