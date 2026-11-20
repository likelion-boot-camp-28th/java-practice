package com.ohgiraffers.level01.basic.shirt.model;

public enum ShirtSize {
    SMALL, MEDIUM, LARGE;

    @Override
    public String toString() {
        return "ShirtSize : {" +this.name()+"}";
    }
}
