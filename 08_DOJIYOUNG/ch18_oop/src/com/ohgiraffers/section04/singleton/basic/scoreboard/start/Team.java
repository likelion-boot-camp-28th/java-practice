package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public class Team {

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public void score(int point) {

        ScoreBoard.INSTANCE.add(point);
        System.out.println(name + " " + point + "점");
    }
}