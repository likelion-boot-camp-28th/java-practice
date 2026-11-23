package com.ohgiraffers.level03.hard.fruit.model;

public class Fruit {
    private String name; // 과일이름

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 과일이름을 반환함
    @Override
    public String toString() {
        return name;
    }
}
