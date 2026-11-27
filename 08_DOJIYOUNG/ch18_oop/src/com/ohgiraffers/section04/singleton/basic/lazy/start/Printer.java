package com.ohgiraffers.section04.singleton.basic.lazy.start;

public class Printer {

    private static int createCount = 0;


    /* 프린터에 연결하는 데 시간이 걸린다고 가정하고 10ms 기다린다. */
    private Printer() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        createCount++;
    }

    private static class Holder {
        private static final Printer INSTANCE = new Printer();
    }

    public static  Printer getInstance() {
         return Holder.INSTANCE;
    }


    public static int getCreateCount() {
        return createCount;
    }
}