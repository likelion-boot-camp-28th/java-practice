package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

// 문장을 공백으로 나눠 단어마다 나온 횟수를 센다.
// 단어가 알파벳순으로 정렬되도록 TreeMap에 담아 반환한다.
// static 메소드가 아니므로 new WordCounter()로 만들어 부른다.
public class WordCounter {
    public Map<String,Integer> count(String sentence){
        Map<String,Integer> treeMap = new TreeMap<>();
        String[ ] starr = sentence.split(" ");

        for(int i=0; i<starr.length;i++) {
            if(treeMap.containsKey(starr[i])){
                treeMap.put(starr[i], treeMap.get(starr[i]) + 1);
            }
            else{
                treeMap.put(starr[i],1);
            }
        }
        return treeMap;
    }

    /**
     * for(String s : strArr) {
     *     if(!(treeMap.containKey(s))){
     *         treemap.put(s,1);
     *     }else{
     *         treemap.put(s,treemap.get(s)
     *     }
     * }
     */
}
