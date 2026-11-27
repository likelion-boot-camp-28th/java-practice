package com.ohgiraffers.section04.singleton.basic.token.start;

/* 대기 번호를 발급하는 기계다. 프로그램 전체에서 하나여야 한다. */
public class TokenIssuer {

    private static int createCount = 0;
    private static TokenIssuer instance;

    private int issued = 0;

    /* 기계를 켜는 데 시간이 걸린다고 가정하고 10ms 기다린다. */
    private TokenIssuer() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        createCount++;
    }

    // TODO 단계 2: 메소드 선언의 static 뒤에 synchronized를 넣는다
    public static synchronized TokenIssuer getInstance() {
        if (instance == null) {
            instance = new TokenIssuer();
        }
        return instance;
    }

    // TODO 단계 3: 메소드 선언의 public 뒤에 synchronized를 넣는다
    public synchronized void  next() {
        issued = issued + 1;
    }

    public int getIssued() {
        return issued;
    }

    public static int getCreateCount() {
        return createCount;
    }
}