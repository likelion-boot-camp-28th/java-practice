package com.ohgiraffers.level03.hard.fruit.model;

public class Box<T> {
    private T item = null;

    public void put(T item){
        this.item = item;
    }

    public T get(){
        return this.item;
    }
}
