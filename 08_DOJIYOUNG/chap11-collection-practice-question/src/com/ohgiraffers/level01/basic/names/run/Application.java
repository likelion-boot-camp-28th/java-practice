package com.ohgiraffers.level01.basic.names.run;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        /**
         * 이름 배열 {"민수", "서연", "민수", "지훈", "서연", "유진"}의 이름을
         * LinkedHashSet, TreeSet, HashSet에 모두 넣는다. 세 Set은 Set<String> 타입 변수에 담는다.
         * 넣은 순서 :  뒤에 LinkedHashSet을, 가나다순 :  뒤에 TreeSet을 붙여 출력하고,
         *  HashSet은 내용 대신 중복 없는 이름 수 : <N>으로 크기만 출력한다.**/

        // 1. 중복이 섞인 이름 배열을 만든다
        String[] arr = new String[]{"민수", "서연", "민수", "지훈", "서연", "유진"} ;

        // 2. 세 가지 Set을 만들고 이름을 모두 넣는다
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();

        for (String name : arr) {
            linkedHashSet.add(name);
            treeSet.add(name);
            hashSet.add(name);
        }


        // 3. LinkedHashSet과 TreeSet은 그대로, HashSet은 크기만 출력한다
        System.out.println("넣은 순서 : " + linkedHashSet);
        System.out.println("가나다순 : " + treeSet);
        System.out.println("중복 없는 이름 수 : " + hashSet.size());
    }
}
