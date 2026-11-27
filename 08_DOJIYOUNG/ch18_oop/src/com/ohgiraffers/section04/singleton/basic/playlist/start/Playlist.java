package com.ohgiraffers.section04.singleton.basic.playlist.start;

import java.util.ArrayList;
import java.util.List;

/* 음악 앱의 재생 목록이다. 앱 전체에서 재생 목록은 하나여야 한다. */
public class Playlist {

    private static Playlist instance = new Playlist();

    private List<String> songs = new ArrayList<>();

    // TODO 단계 1: 다른 클래스에서 new 하지 못하게 생성자를 private으로 바꾼다
    private Playlist() {
    }

    // TODO 단계 3: 부를 때마다 새 객체를 만들지 않고 instance를 돌려주게 바꾼다
    public static Playlist getInstance() {
        return instance;
        //return new Playlist();
    }

    public void add(String song) {
        songs.add(song);
    }

    public int size() {
        return songs.size();
    }
}