package com.ohgiraffers.section04.singleton.basic.settings.start;

public class HomeScreen {

    // TODO 단계 2: HomeScreen과 SettingScreen의 new AppSettings()를 AppSettings.getInstance()로 바꾼다
    private AppSettings settings =  AppSettings.getInstance();

    public String showTheme() {
        return settings.getTheme();
    }

    public AppSettings getSettings() {
        return settings;
    }
}