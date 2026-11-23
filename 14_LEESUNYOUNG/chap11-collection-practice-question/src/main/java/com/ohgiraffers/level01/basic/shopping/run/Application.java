package com.ohgiraffers.level01.basic.shopping.run;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("우유");
        list.add("빵");
        list.add("계란");
        list.add("사과");
        list.set(1,"치즈");
        list.remove("빵");
        list.set(0,"두유");

        System.out.println(list);
        System.out.println("개수 : " + list.toArray().length);
        System.out.println("사과 있음 : " + list.contains("사과"));
        System.out.println("계란 위치 : " + list.indexOf("계란"));
    }
}
