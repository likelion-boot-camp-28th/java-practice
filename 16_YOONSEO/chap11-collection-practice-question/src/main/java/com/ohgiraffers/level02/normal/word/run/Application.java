package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        /**
         * 문장 java is fun and java is powerful java의
         * 단어별 횟수를 <단어> : <횟수>로 한 줄씩 출력한다.
         * 출력하면서 가장 많이 나온 단어를 찾아
         * 마지막에 가장 많은 단어 : <단어> (<횟수>번)을 출력한다.
         */

        // 1. WordCounter로 문장의 단어별 횟수를 센다
        WordCounter counter = new WordCounter();
        Map<String, Integer> counts = counter.count("java is fun and java is powerful java");

        // 2. 단어별 횟수를 한 줄씩 출력하면서 가장 많이 나온 단어를 찾는다
        String  topWord = "";
        int topCount = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() > topCount) {
                topWord = entry.getKey();
                topCount = entry.getValue();
            }
        }

        // 3. 가장 많이 나온 단어와 횟수를 출력한다
        System.out.println("가장 많은 단어 : " + topWord + " (" + topCount + "번)");

    }
}
