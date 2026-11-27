package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public class Application {

    public static void main(String[] args) {


        Team blue = new Team("청팀");
        Team white = new Team("백팀");

        blue.score(3);
        white.score(2);
        blue.score(1);

        System.out.println("전체 점수: " + ScoreBoard.INSTANCE.getTotal());
    }
}