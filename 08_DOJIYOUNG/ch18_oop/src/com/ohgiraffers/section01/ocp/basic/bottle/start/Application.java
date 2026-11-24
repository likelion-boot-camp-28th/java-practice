package com.ohgiraffers.section01.ocp.basic.bottle.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 물병 하나를 이름 변수와 남은 양 변수 두 개로 다룬다.
         * 물을 채우거나 마실 때마다 계산 줄과 출력 줄을 물병마다 따로 적었다.
         * */
        // TODO 단계 4: 파란 물병의 변수 두 개와 계산·출력 줄을 WaterBottle 객체 blue 하나로 바꾼다
        String blueName = "파란 물병";
        int blueAmount = 0;
        blueAmount = blueAmount + 500;
        WaterBottle blue = new WaterBottle(blueName,blueAmount);
        // System.out.println(blueName + ": 500ml 채움, 남은 양 " + blueAmount + "ml");
        blue.fill(500);
        blue.drink(200);
        //blueAmount = blueAmount - 200;
        //System.out.println(blueName + ": 200ml 마심, 남은 양 " + blueAmount + "ml");

        // TODO 단계 5: 초록 물병도 WaterBottle 객체 green 하나로 바꾼다
        String greenName = "초록 물병";
        int greenAmount = 0;
        greenAmount = greenAmount + 300;
        WaterBottle green = new WaterBottle(greenName,greenAmount);
//        System.out.println(greenName + ": 300ml 채움, 남은 양 " + greenAmount + "ml");
//        greenAmount = greenAmount - 100;
//        System.out.println(greenName + ": 100ml 마심, 남은 양 " + greenAmount + "ml");
        green.fill(300);
        green.drink(100);
    }
}