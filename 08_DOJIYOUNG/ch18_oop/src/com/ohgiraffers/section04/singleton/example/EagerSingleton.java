package com.ohgiraffers.section04.singleton.example;

public class EagerSingleton {

    /* 클래스가 처음 생성될 때 객체를 하나만 생성해 둔다. */
    private static EagerSingleton instance = new EagerSingleton();

    /* 생성자의 접근 제한자를 private로 만들어서 다른곳에서는 직접 생성하지 못하게 막음 */
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
