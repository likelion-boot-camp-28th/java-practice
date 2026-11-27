package com.ohgiraffers.section04.singleton.basic.settings.start;

public class Application {

    public static void main(String[] args) {

        HomeScreen home = new HomeScreen();
        SettingScreen setting = new SettingScreen();

        setting.changeTheme("어둡게");
        System.out.println("설정 화면 테마: " + setting.getSettings().getTheme());
        System.out.println("홈 화면 테마: " + home.showTheme());
        System.out.println("같은 객체인가: " + (home.getSettings() == setting.getSettings()));

        // TODO 단계 4: 아래 주석을 풀어 컴파일 오류를 확인하고 다시 주석으로 되돌린다
        //AppSettings other = new AppSettings();
    }
}