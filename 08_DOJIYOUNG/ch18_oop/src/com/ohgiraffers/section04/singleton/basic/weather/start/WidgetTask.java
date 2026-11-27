package com.ohgiraffers.section04.singleton.basic.weather.start;

/* 위젯 하나가 할 일: 날씨 연결 객체를 받아 둔다. 이 파일은 고치지 않는다. */
public class WidgetTask implements Runnable {

    private WeatherClient received;

    @Override
    public void run() {
        received = WeatherClient.getInstance();
    }

    public WeatherClient getReceived() {
        return received;
    }
}