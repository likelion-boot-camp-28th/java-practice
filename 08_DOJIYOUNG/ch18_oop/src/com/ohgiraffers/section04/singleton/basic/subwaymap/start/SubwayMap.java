package com.ohgiraffers.section04.singleton.basic.subwaymap.start;

/* 지하철 노선도다. 노선도를 불러오는 데 시간이 걸린다고 가정하고, 불러올 때 한 줄을 출력한다. */
public class SubwayMap {

    // TODO 단계 3: 쓰지 않게 된 instance 필드를 지운다
    // private static SubwayMap instance = new SubwayMap();

    private SubwayMap() {
        System.out.println("노선도 불러오는 중");
    }

    // 노선도 객체 없이 부르는 static 메소드다. 노선도 버전만 알려 준다.
    public static String version() {
        return "2026.11";
    }

    // TODO 단계 1: getInstance() 위에 SubwayMap 객체 하나를 담는 static 중첩 클래스 Holder를 만든다
    private static class Holder {
        private static final SubwayMap INSTANCE = new SubwayMap();
    }

    // TODO 단계 2: getInstance()가 Holder.INSTANCE를 돌려주게 바꾼다
    public static SubwayMap getInstance() {
        return Holder.INSTANCE;
    }

    public String lineOf(String station) {
        if (station.equals("서울역")) {
            return "1호선·4호선";
        }
        return "알 수 없음";
    }
}