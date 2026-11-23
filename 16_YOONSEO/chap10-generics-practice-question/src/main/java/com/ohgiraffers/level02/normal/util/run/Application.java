package com.ohgiraffers.level02.normal.util.run;

import com.ohgiraffers.level02.normal.util.model.ArrayUtil;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /**
         * String[] {"가", "나", "다", "나"}는 0번과 2번을 바꾸고,
         * "나"의 개수와 마지막 값을 출력한다.
         * Integer[] {3, 1, 3, 3}은 0번과 3번을 바꾸고, 3의 개수와 마지막 값을 출력한다.
         * 출력 줄은 바꾼 뒤 : <배열>, "나" 개수 : <N>(큰따옴표 포함),
         * 3 개수 : <N>, 마지막 : <값>이다. 배열은 Arrays.toString으로 출력한다.
         */

        ArrayUtil ex = new ArrayUtil();

        // 1. String 배열의 0번과 2번을 바꾸고 "나" 개수와 마지막 값을 출력한다
        String[] str = {"가", "나", "다", "나"};
        ex.swap(str, 0, 2);
        System.out.println("바꾼 뒤 :" + Arrays.toString(str));
        System.out.println("\"나\"의 개수 : " + ex.count(str, "나"));
        System.out.println("마지막 : " + ex.last(str));


        // 2. Integer 배열의 0번과 3번을 바꾸고 3의 개수와 마지막 값을 출력한다
        Integer[] intStr = {3, 1, 3, 3};
        ex.swap(intStr,0,3);
        System.out.println("바꾼 뒤 :" + Arrays.toString(intStr));
        System.out.println("3 개수 : " + ex.count(intStr, 3));
        System.out.println("마지막 : " + ex.last(intStr));
    }
}
