package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        /**
         * List<String> 목록을 ArrayList로 만들고 우유, 빵, 계란, 사과를 차례로 넣는다.
         * 이어서 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번 위치를 두유로 바꾼다.
         * 목록을 출력한 뒤 개수 : <N>,
         * 사과 있음 : <포함 여부>,
         * 계란 위치 : <N>을 출력한다.
         * 포함 여부는 true 또는 false다.**/

        ArrayList<String> arrayList = new ArrayList<>();
        // 1. 장보기 목록에 우유, 빵, 계란, 사과를 차례로 넣는다
        arrayList.add("milk");
        arrayList.add("bread");
        arrayList.add("egg");
        arrayList.add("apple");


        // 2. 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번을 두유로 바꾼다
        System.out.println("원래 : " + arrayList.toString());

        arrayList.add(1,"cheese");
        System.out.println("치즈추가 : " + arrayList.toString());

        arrayList.remove(2);
        System.out.println("빵지우기 : " + arrayList.toString());


        arrayList.set(0, "soymilk");
        System.out.println("두유바꾸기 : " + arrayList.toString());

        // 3. 목록, 개수, 사과 포함 여부, 계란 위치를 출력한다
        System.out.println("개수  : " + arrayList.size());
        System.out.println("사과포함 여부 : " + arrayList.contains("apple"));
        System.out.println("계란 위치 " + arrayList.indexOf("egg"));
    }
}
