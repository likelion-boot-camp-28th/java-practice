package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        String str = "java is fun and java is powerful java";
        String[] words = str.split(" ");

        WordCounter counter = new WordCounter();
        Map<String, Integer> counts = counter.count(str);


    }
}
