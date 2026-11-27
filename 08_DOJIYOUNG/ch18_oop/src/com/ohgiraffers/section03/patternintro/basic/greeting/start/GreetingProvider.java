package com.ohgiraffers.section03.patternintro.basic.greeting.start;

// TODO 단계 3: 쓰지 않게 된 이 파일과 Greeting.java, KoreanGreeting.java를 지운다
public class GreetingProvider {

    private Greeting greeting = new KoreanGreeting();

    public String greet() {
        return greeting.message();
    }
}