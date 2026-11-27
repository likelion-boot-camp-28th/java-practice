package com.ohgiraffers.section03.patternintro.basic.greeting.start;

public class Application {

    public static void main(String[] args) {

        /* 인사말 하나를 얻으려고 인터페이스, 구현 클래스, 제공 클래스를 거친다. 구현은 하나뿐이다. */
        // TODO 단계 1: 같은 패키지에 "안녕하세요"를 돌려주는 message() 메소드를 가진 Greeter 클래스를 만든다
        // TODO 단계 2: 아래 두 줄이 GreetingProvider 대신 Greeter를 쓰게 바꾼다
//        GreetingProvider provider = new GreetingProvider();
//        System.out.println("인사말: " + provider.greet());
        Greeter greeter = new Greeter();
        System.out.println("인사말: " + greeter.message("김하늘"));


        // TODO 단계 4: message가 이름을 받아 "안녕하세요, 김하늘님"을 돌려주게 바꾸고 여기서 "김하늘"을 넘긴다
    }
}