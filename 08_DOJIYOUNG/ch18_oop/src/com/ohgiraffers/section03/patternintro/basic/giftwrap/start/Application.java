package com.ohgiraffers.section03.patternintro.basic.giftwrap.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * 포장 종류를 글자로 나눈다. 종류마다 요금은 GiftWrap이, 이름은 WrapLabel이 if로 정한다.
         * 포장 종류는 지난달에 고급 포장이 생겼고, 다음 달에 상자 포장이 생긴다.
         * */
        // TODO 단계 1: 같은 패키지에 이름 label()과 요금 fee()를 정한 인터페이스 Wrap을 만든다
        // TODO 단계 2: 「기본 포장」, 1000원을 돌려주는 BasicWrap을 만든다
        // TODO 단계 3: 「고급 포장」, 3000원을 돌려주는 PremiumWrap을 만든다
        // TODO 단계 4: 아래 코드를 List<Wrap>에 BasicWrap·PremiumWrap을 담아 반복 한 번으로 출력하는 코드로 바꾼다
        //GiftWrap giftWrap = new GiftWrap();
        //WrapLabel wrapLabel = new WrapLabel();
        List<Wrap> wraps = new ArrayList<>();
        wraps.add(new BasicWrap());
        wraps.add(new PremiunWrap());
        wraps.add(new BoxWrap());

        //List<String> types = new ArrayList<>();
        //types.add("BASIC");
        //types.add("PREMIUM");

        for (Wrap wrap : wraps){
            System.out.println(wrap.label() + ": " + wrap.fee() + "원");
        }
    }
}