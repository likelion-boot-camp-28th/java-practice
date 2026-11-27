package com.ohgiraffers.section04.singleton.basic.weather.start;

public class WeatherClient {

    // TODO 단계 2: 오른쪽에 = new WeatherClient()를 더해 이른 초기화로 바꾼다
    // TODO 단계 4: 선언에 final을 더한다
    private static final WeatherClient instance = new WeatherClient();

    /* 날씨 서버에 연결하는 데 시간이 걸린다고 가정하고 10ms 기다린다. */
    private WeatherClient() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // TODO 단계 3: if 블록을 지우고 return instance; 한 줄만 남긴다
    public static WeatherClient getInstance() {
        return instance;
    }
}