package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {
    public static void main(String[] args) {
        int total = 0;
        WashCourse longest = WashCourse.STANDARD;

        for (WashCourse ws : WashCourse.values()){
            System.out.println(ws.getLabel() + " : " + ws.getMinutes()+"분");
            total += ws.getMinutes();
            if (longest.getMinutes() < ws.getMinutes()){
                longest = ws;
            }
        }
        System.out.println("전체시간 : " + total +"분");
        System.out.println("가장 긴 코스 : " + longest.getLabel() );

    }
}
