package com.ohgiraffers.level02.normal.word.run;

import com.ohgiraffers.level02.normal.word.controller.WordCounter;
import java.util.*;

public class Application {
    public static void main(String[] args) {
//        문장 java is fun and java is powerful java
//        의 단어별 횟수를 <단어> : <횟수>로 한 줄씩 출력한다.
//        출력하면서 가장 많이 나온 단어를 찾아
//        마지막에 가장 많은 단어 : <단어> (<횟수>번)을 출력한다.
        String s = "java is fun and java is powerful java";
        Map<String, Integer> map = new WordCounter().count(s);

        int maxCnt = -1;

        for(String ks: map.keySet()){
            System.out.print(ks);
            System.out.print(" : ");
            System.out.print(map.get(ks));
            if(maxCnt<map.get(ks)){maxCnt=map.get(ks);}
            System.out.println();
        }

        for(String ks: map.keySet()){
           if(map.get(ks) == maxCnt){
               System.out.print("가장 많이 나온 단어 : ");
               System.out.print(ks+" ");
               System.out.print(map.get(ks) + "번");
           }
        }


    }
}
