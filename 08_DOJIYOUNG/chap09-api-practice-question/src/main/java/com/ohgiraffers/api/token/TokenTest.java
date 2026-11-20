package com.ohgiraffers.api.token;

public class TokenTest {
    public static void main(String[] args) {

        /***
        - 요구사항
        1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
        2. 토큰 처리전 글자 및 개수 출력
        3. 토큰 처리 후 문자배열 갯수 출력 확인
        4. `char[]` 값 출력
        5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
         **/

        String str = "J a v a P r o g r a m ";
        String[] strArr = str.split(" ");
        char[] charArr = new char[strArr.length];

        for(int i=0; i< strArr.length; i++){
            charArr[i] = strArr[i].charAt(0);
        }

        System.out.println("char[] 출력");
        for(char c: charArr){
            System.out.print(c+", ");
        }

        String[] strArr2 = new String[charArr.length];

        for(int i=0; i< charArr.length; i++){
            strArr2[i] = (charArr[i]+"").toUpperCase();
        }

        for(String s: strArr2){
            System.out.print(s+", ");
        }
    }
}
