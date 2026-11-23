package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {

    public Map<String,Integer> count(String sentence){
        // 문장을 공백으로 나눠 단어마다 나온 횟수를 센다.
        // 단어가 알파벳순으로 정렬되도록 TreeMap에 담아 반환한다.
        // static 메소드가 아니므로 new WordCounter()로 만들어 부른다
        Map<String, Integer> tm = new TreeMap<>();

        String[] strArr = sentence.split(" ");

        for(String s: strArr){
            if(!(tm.containsKey(s))){
                tm.put(s,1);
            }else{
                tm.put(s,tm.get(s)+1);
            }
        }

        return tm;

    }
}
