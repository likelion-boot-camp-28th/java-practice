package com.ohgiraffers.level02.normal.number.run;

import com.ohgiraffers.level02.normal.number.model.NumberBox;

public class Application {
    public static void main(String[] args) {
        NumberBox<Integer> nb1 = new NumberBox<>(7, 5);
        System.out.println(nb1.sum());
        System.out.println(nb1.isFistBigger());

        NumberBox<Double> nb2 = new NumberBox<>(2.5, 1.25);
        System.out.println(nb2.sum());
        System.out.println(nb2.isFistBigger());


    }
}
