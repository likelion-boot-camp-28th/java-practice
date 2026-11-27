package com.ohgiraffers.section04.singleton.basic.settings.start;

public class SettingScreen {

    private AppSettings settings =  AppSettings.getInstance();

    public void changeTheme(String theme) {
        settings.changeTheme(theme);
    }

    public AppSettings getSettings() {
        return settings;
    }
}