package com.ohgiraffers.section01.ocp.basic.bottle.start;

/* 물병 하나를 나타내는 클래스다. */
public class WaterBottle {

    // TODO 단계 1: 물병 이름 String name과 남은 양 int amount 필드를 만든다
    private String name;
    private int amount;

    public WaterBottle(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // TODO 단계 2: amount를 ml만큼 늘리고 결과를 출력하는 fill(int ml) 메소드를 만든다
    public void fill(int ml){
        this.amount+=ml;
        System.out.println(name +": "+ml+"ml 채움, 남은 양"+amount+"ml");
    }

    // TODO 단계 3: amount를 ml만큼 줄이고 결과를 출력하는 drink(int ml) 메소드를 만든다
    public void drink(int ml){
        this.amount-=ml;
        System.out.println(name +": "+ml+"ml 마심, 남은 양"+amount+"ml");
    }
}