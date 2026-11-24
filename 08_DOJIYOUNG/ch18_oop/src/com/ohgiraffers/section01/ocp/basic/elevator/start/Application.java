package com.ohgiraffers.section01.ocp.basic.elevator.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 엘리베이터 두 대를 Elevator 객체 두 개로 만든다.
         * 엘리베이터를 옮길 때마다 바깥 코드가 이동하는 줄을 출력하고 floor 필드를 직접 바꾼다.
         * */
        Elevator first = new Elevator("1호기",1);
        //first.name = "1호기";
        //first.floor = 1;

        Elevator second = new Elevator("2호기",1);
        //second.name = "2호기";
        //second.floor = 1;

        // TODO 단계 2: 아래 이동 코드 세 묶음(두 줄씩)을 moveTo 호출 세 줄로 바꾼다
        //System.out.println(first.name + ": " + first.floor + "층 → 7층");
        //first.floor = 7;
        first.moveTo(7);
        //System.out.println(second.name + ": " + second.floor + "층 → 4층");
        //second.floor = 4;
        second.moveTo(4);
        //System.out.println(first.name + ": " + first.floor + "층 → 3층");
        //first.floor = 3;
        first.moveTo(3);

        System.out.println(first.name + " 현재 층: " + first.floor + "층");
        System.out.println(second.name + " 현재 층: " + second.floor + "층");

        // TODO 단계 4: 1호기를 지금 있는 3층으로 다시 부르는 moveTo 호출을 한 줄 더한다
        first.moveTo(3);
    }
}