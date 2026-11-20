package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.Locale;

public class TokenTest {
    public static void main(String[] args) {
        /**
         * 1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
         * 2. 토큰 처리전 글자 및 개수 출력
         * 3. 토큰 처리 후 문자배열 갯수 출력 확인
         * 4. `char[]` 값 출력
         * 5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
         */

        // 토큰 처리전 글자 및 개수 출력
        String s = "J a v a P r o g r a m ";
        System.out.println("토큰 처리 전 : "+s);
        System.out.println("토큰 처리 전 : " +s.length()+"개");

        // 토큰 처리 후 문자배열 갯수 출력 확인
        String[] s2 = s.split(" ");
        System.out.println("토큰 처리 후: "+s2.length+"개");
        char ch[]= new char[s2.length];

        for(int i=0; i<s2.length; i++){
            ch[i] = s2[i].charAt(0);    //***
        }

        System.out.println(Arrays.toString(ch));
        System.out.println(ch);

        System.out.println(new String(ch).toUpperCase());
    }
}
