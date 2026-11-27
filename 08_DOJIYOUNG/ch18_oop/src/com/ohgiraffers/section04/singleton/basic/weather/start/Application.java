package com.ohgiraffers.section04.singleton.basic.weather.start;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        /* 앱을 켜자마자 위젯 8개가 각자 스레드에서 날씨 연결 객체를 받는다. 이 파일은 고치지 않는다. */
        WidgetTask[] tasks = new WidgetTask[8];
        Thread[] threads = new Thread[8];
        for (int i = 0; i < threads.length; i++) {
            tasks[i] = new WidgetTask();
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        /* 위젯이 받은 객체 가운데 서로 다른 것이 몇 개인지 센다. 앞 위젯과 같은 객체면 세지 않는다. */
        int kinds = 0;
        for (int i = 0; i < tasks.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (tasks[j].getReceived() == tasks[i].getReceived()) {
                    seen = true;
                }
            }
            if (!seen) {
                kinds++;
            }
        }
        System.out.println("위젯이 받은 객체 수: " + kinds);
    }
}