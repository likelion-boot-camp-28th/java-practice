package com.ohgiraffers.level01.basic.names.run;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        String[] str = {"민수", "서연", "민수", "지훈", "서연", "유진"};
        Set<String> lh = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();
        Set<String> hs = new HashSet<>();
        lh.addAll(Arrays.asList(str));
        ts.addAll(Arrays.asList(str));
        hs.addAll(Arrays.asList(str));

        System.out.println("넣은 순서 : " + lh);
        System.out.println("가나다순 : " + ts);
        System.out.println("중복 없는 이름 수 : " + hs.size());

    }
}
