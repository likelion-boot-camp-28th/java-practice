package com.ohgiraffers.level01.basic.shopping.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        /**
         * List<String> 목록을 ArrayList로 만들고 우유, 빵, 계란, 사과를 차례로 넣는다.
         * 이어서 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번 위치를 두유로 바꾼다.
         * 목록을 출력한 뒤 개수 : <N>, 사과 있음 : <포함 여부>, 계란 위치 : <N>을 출력한다.
         * 포함 여부는 true 또는 false다.
         */
        // 1. 장보기 목록에 우유, 빵, 계란, 사과를 차례로 넣는다
        List<String> list = new ArrayList<>(List.of("우유","빵","계란","사과"));

        // 2. 1번 위치에 치즈를 끼워 넣고, 빵을 지우고, 0번을 두유로 바꾼다
        list.add(1,"치즈");
        list.remove("빵");
        list.set(0,"두유");

        // 3. 목록, 개수, 사과 포함 여부, 계란 위치를 출력한다
        System.out.println(list);
        System.out.println("개수 : " + list.size());

        boolean bl = false;
        for(String st : list){
            if(st.equals("사과")) bl=true;
        }
        System.out.println("사과 있음 : " + bl);

        int n =0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("계란")) n=i;
        }
        System.out.println("계란 위치 : "+ n);

    }
}
