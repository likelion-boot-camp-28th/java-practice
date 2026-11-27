package com.ohgiraffers.section04.singleton.basic.subwaymap.start;

public class Application {

    public static void main(String[] args) {

        /* 앱을 켜면 노선도 버전을 먼저 보여 주고, 역을 검색할 때 노선도를 쓴다. 이 파일은 고치지 않는다. */
        System.out.println("[앱 시작]");
        System.out.println("노선도 버전: " + SubwayMap.version());

        System.out.println("[역 검색]");
        SubwayMap map = SubwayMap.getInstance();
        System.out.println("서울역: " + map.lineOf("서울역"));
    }
}