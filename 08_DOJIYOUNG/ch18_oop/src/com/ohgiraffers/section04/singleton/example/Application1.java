package com.ohgiraffers.section04.singleton.example;

public class Application1 {
    public static void main(String[] args) {

        EagerSingleton fir =  EagerSingleton.getInstance();
        EagerSingleton sec =  EagerSingleton.getInstance();

        System.out.println("같은 객체인지 확인 : "+(fir == sec));


        /**  그래서 싱글톤은 다른 클래스에서 new를 부르지 못하게 막고,
         * 모두가 객체 하나를 받아 쓰게 한다. */
        PlainSetting settingScreen = new PlainSetting();   // 설정 화면이 만든 객체
        PlainSetting homeScreen = new PlainSetting();      // 홈 화면이 만든 객체

        settingScreen.setTheme("어둡게");
        System.out.println("설정 화면 테마: " + settingScreen.getTheme());
        System.out.println("홈 화면 테마: " + homeScreen.getTheme());

    }
}
