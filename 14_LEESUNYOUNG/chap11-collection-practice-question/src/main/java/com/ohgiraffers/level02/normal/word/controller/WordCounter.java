package com.ohgiraffers.level02.normal.word.controller;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    public Map<String, Integer> count(String sentence) {
        TreeMap<String, Integer> counts = new TreeMap<>();
        String[] words = sentence.trim().split(" ");

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        return counts;
    }
}
