package com.ohgiraffers.section04.singleton.basic.lazy.start;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        /* 스레드 10개가 동시에 Printer.getInstance()를 부른다. 이 파일은 고치지 않는다. */
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new PrintTask());
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("생성 횟수: " + Printer.getCreateCount());
    }
}