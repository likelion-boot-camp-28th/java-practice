package com.ohgiraffers.section04.singleton.basic.token.start;

/* 스레드 하나가 할 일: 번호를 1000장 발급한다. 이 파일은 고치지 않는다. */
public class IssueTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            TokenIssuer.getInstance().next();
        }
    }
}