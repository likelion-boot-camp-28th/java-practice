package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {

    public String makeJuice(Box<? extends Fruit> box) {
        Fruit fruit = box.get();
        return fruit.getName() + " 주스 완성";
    }

    public void fillApple(Box<? super Apple> box){
        // 상자에 새 사과 객체 넣음
        Apple apple = new Apple();
        box.put(apple);
    }

    public String describe(Box<?> box){
        // 상자가 비어 있으면 비어 있음을, 아니면 꺼낸 값의 toString() 결과를 반환한다.
        String result = "";
        if(box.get()== null){
            result = "비어있음";
        }else{
            result = box.get().toString();
        }
        return result;
    }
}
