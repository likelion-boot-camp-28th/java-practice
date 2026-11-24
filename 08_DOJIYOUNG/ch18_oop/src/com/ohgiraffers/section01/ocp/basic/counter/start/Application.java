package com.ohgiraffers.section01.ocp.basic.counter.start;

public class Application {

    public static void main(String[] args) {

        /* 방문자가 들어올 때마다 바깥 코드가 count 필드를 직접 바꾼다. */
        Counter counter = new Counter();

        // TODO 단계 3: 아래 세 줄은 increase() 호출로, 출력 줄의 counter.count는 getCount() 호출로 바꾼다
        //counter.count = counter.count + 1;
        counter.increase();
        counter.increase();
        counter.increase();

        //counter.count = counter.count + 1;
        //counter.count = counter.count + 1;

        // counter.getCount() = -5;
        System.out.println("방문자 수: " + counter.getCount());
    }
}