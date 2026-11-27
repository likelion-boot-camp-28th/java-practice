package com.ohgiraffers.section04.singleton.basic.settings.start;

public class AppSettings {

    private String theme = "밝게";

    // TODO 단계 3: 다른 클래스에서 new 하지 못하게 생성자를 private으로 바꾼다
    private AppSettings() {
    }

    // TODO 단계 1: 객체 하나를 담는 static 필드 instance와, 그 객체를 돌려주는 static 메소드 getInstance()를 만든다
    private static AppSettings instance = new AppSettings();
    public static AppSettings getInstance(){
        return instance;
    }

    public String getTheme() {
        return theme;
    }

    public void changeTheme(String theme) {
        this.theme = theme;
    }
}