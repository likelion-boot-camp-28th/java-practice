package com.ohgiraffers.level03.hard.fruit.controller;

import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;

public class Juicer {

    // 상자에서 과일을 꺼내 "<과일 이름> 주스 완성"을 반환한다.
    public String makeJuice(Box<? extends Fruit> box) {
        Fruit fruit = box.get();
        return fruit.getName()+"주스 완성";
    }

    // 상자에 새 사과 객체를 넣는다. 반환값과 출력은 없다
    public void fillApple(Box<? super Fruit> box) {
        box.put(new Apple());
    }

    // 상자가 비어 있으면 "비어 있음"을, 아니면 꺼낸 값의 toString() 결과를 반환한다.
    public String describe(Box<?> box) {
        Object item = box.get();
        if(item!=null){
            return item.toString();
        }
        return "비어있음";
    }

}
