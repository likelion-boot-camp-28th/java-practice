package com.ohgiraffers.level01.basic.pair.run;

import com.ohgiraffers.level01.basic.pair.model.Pair;

public class Application {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("국어", 90);
        Pair<Integer, String> pair2 = new Pair<>(1, "일등");
        Pair<String, Boolean> pair3 = new Pair<>("출석", true);
        // 을 만들어 한 줄씩 출력한다.
        // 마지막으로 첫 쌍의 키와 값을 꺼내 <키> 점수 + 5 = <값에 5를 더한 수>를 출력한다.

        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        System.out.println(pair3.toString());

        int gookscore = pair1.getValue();
        System.out.println("국어 점수 +5 = "+gookscore+5);

    }
}
