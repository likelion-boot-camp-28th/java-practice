package com.ohgiraffers.section04.singleton.example;

/* 싱글톤을 쓰기 전: 보통 클래스라서 new를 부를 때마다 설정 객체가 새로 생긴다. */
public class PlainSetting {

    private String theme = "밝게";

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}