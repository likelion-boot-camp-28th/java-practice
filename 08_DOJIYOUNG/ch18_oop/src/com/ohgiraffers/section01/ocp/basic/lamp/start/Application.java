package com.ohgiraffers.section01.ocp.basic.lamp.start;

public class Application {
    public static void main(String[] args) {

        /*
         * 전구 하나를 이름 변수와 밝기 변수 두 개로 다룬다.
         * 전구가 하나 늘 때마다 변수도 두 개씩 늘어난다.
         * */
        // TODO 단계 3: 안방 전구의 변수 두 개를 Lamp 객체 room 하나로 바꾼다

        String roomName = "안방";
        int roomBrightness = 0;
        roomBrightness = 30;
        Lamp room = new Lamp(roomName,roomBrightness);
        System.out.println(roomName + " 전구 밝기: " + roomBrightness);

        // TODO 단계 4: 거실 전구의 변수 두 개를 Lamp 객체 living 하나로 바꾼다
        String livingName = "거실";
        int livingBrightness = 0;
        livingBrightness = 70;
        Lamp living = new Lamp(livingName,livingBrightness);
        System.out.println(livingName + " 전구 밝기: " + livingBrightness);
    }
}

