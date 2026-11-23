package com.ohgiraffers.level01.basic.season.run;

import com.ohgiraffers.level01.basic.season.model.Season;

public class Application {
    public static void main(String[] args) {
        for (Season s : Season.values()){
            System.out.println(s.ordinal()+ " : " + s.name());
        }
        Season found = Season.valueOf("FALL");
        System.out.println("찾은 상수 : " + found);
        System.out.println("FALL의 순서 : " + found.ordinal());
        System.out.println("FALL과 같은가:" + (found == Season.FALL));

    }
}
