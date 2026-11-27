package com.ohgiraffers.section04.singleton.basic.lazy.start;

/* 스레드 하나가 할 일: Printer.getInstance()를 한 번 부른다. 이 파일은 고치지 않는다. */
public class PrintTask implements Runnable {

    @Override
    public void run() {
        Printer.getInstance();
    }
}