package com.ohgiraffers.api.string;

public class StringProcess {


    // 문자열을 넘겨 받아, 첫 글자를 대문자로 바꾸는 메서드 작성
    public String preChar(String s){
            char ch = s.toUpperCase().charAt(0);
            String s2=ch+"";
            for(int i=1; i<s.length(); i++){
                s2 += s.charAt(i);
            }
            return s2;
    }

    //문자열에서 찾는 문자가 몇 개 포함되어 있는지 반환하는 메서드 작성
    public int charSu(String s, char ch){
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ch ){
                count++;
            }
        }
        return count;
    }

}
