package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

public class Application {
    public static void main(String[] args) {
        //사과를 담은 Box<Apple>과
        //포도를 담은 Box<Grape>로 주스를 만들어
        //결과를 한 줄씩 출력한다.
        Apple apple = new Apple();
        Grape grape = new Grape();
        Box box1 = new Box();
        Box box2 = new Box();
        box1.put(apple);
        box2.put(grape);

        Juicer juicer = new Juicer();
        System.out.println(juicer.makeJuice(box1));
        System.out.println(juicer.makeJuice(box2));

        Box<Fruit> box3 = new Box();
        Box<Object> box4 = new Box();
        juicer.fillApple(box3);
        juicer.fillApple(box4);
        //빈 Box<Fruit>와 빈 Box<Object>에 사과를 채우고
        //Box<Fruit>에 사과 채움 : <상태>,
        //Box<Object>에 사과 채움 : <상태>를 출력한다.
        System.out.println("Box<Fruit>에 사과 채움 : "+juicer.describe(box3));
        System.out.println("Box<Object>에 사과 채움 : "+juicer.describe(box4));


        //마지막으로 아무것도 넣지 않은 Box<String>의 상태를 빈 상자 : <상태>로 출력한다.
        //상태는 describe의 결과다.
        Box<String> box5 = new Box();
        System.out.println("Box<String>: "+juicer.describe(box5));
    }
}
