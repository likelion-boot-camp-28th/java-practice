package com.ohgiraffers.level01.basic.season.run;

import com.ohgiraffers.level01.basic.season.model.Season;

public class Application {
    public static void main(String[] args) {
        // 1. 모든 상수의 순서와 이름을 선언 순서대로 출력한다
        for(Season s: Season.values()){
            System.out.println(s.ordinal()+" : "+ s.name());
        }

        // 2. 문자열 FALL로 상수를 찾아 이름과 순서를 출력한다
        Season season = Season.valueOf("FALL");
        System.out.println("찾은 상수 : "+ season.name() + " 순서 : "+season.ordinal());

        // 3. 찾은 상수가 Season.FALL과 같은지 출력한다
        System.out.println("같은지? " + (season == Season.FALL));
    }
}
