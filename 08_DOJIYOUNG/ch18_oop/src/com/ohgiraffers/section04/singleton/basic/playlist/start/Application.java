package com.ohgiraffers.section04.singleton.basic.playlist.start;

public class Application {

    public static void main(String[] args) {

        /* 홈 화면과 검색 화면이 재생 목록에 곡을 하나씩 넣고, 지금 재생 목록을 꺼내 곡 수를 센다. */
        Playlist home = Playlist.getInstance();
        home.add("봄노래");

        // TODO 단계 2: 아래 줄의 new Playlist()를 Playlist.getInstance()로 바꾼다
        Playlist search = Playlist.getInstance();
        search.add("여름노래");

        Playlist current = Playlist.getInstance();
        System.out.println("같은 객체인가: " + (home == current));
        System.out.println("곡 수: " + current.size());
    }
}