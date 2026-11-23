package com.ohgiraffers.api.string;

public class StringProcess {

    // 문자열을 넘겨 받아, 첫 글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String s){
        String result= s.toUpperCase().charAt(0)+s.substring(1);
        return result;
    }

    // 문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String s, char ch){
        int cnt = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)==ch){cnt++;}
        }

        return cnt;
    }
}
