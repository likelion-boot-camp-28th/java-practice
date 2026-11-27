package com.ohgiraffers.section04.singleton.basic.token.start;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        /* 창구 스레드 10개가 각자 번호를 1000장씩 발급한다. 모두 10000장이어야 한다. 이 파일은 고치지 않는다. */
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new IssueTask());
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("생성 횟수: " + TokenIssuer.getCreateCount());
        System.out.println("발급 수: " + TokenIssuer.getInstance().getIssued());
    }
}