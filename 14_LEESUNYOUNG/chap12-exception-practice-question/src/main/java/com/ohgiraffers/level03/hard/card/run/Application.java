package com.ohgiraffers.level03.hard.card.run;

import com.ohgiraffers.level03.hard.card.controller.CardController;
import com.ohgiraffers.level03.hard.card.model.dto.TransitCard;

public class Application {
    public static void main(String[] args) {
        CardController card = new CardController(new TransitCard(0));
        String[] str = {"충전 5000", "결제 1450", "결제 abc", "충전 -1000", "결제 9000", "충전 10000", "결제 1450"};
        for (int i =0; i<str.length; i++ ){
            card.process(str[i]);
        }
    }
}
