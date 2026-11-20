package com.ohgiraffers.level02.normal.wash.run;

import com.ohgiraffers.level02.normal.wash.model.WashCourse;

public class Application {
    public static void main(String[] args) {
        // 1. 모든 코스의 이름과 시간을 선언 순서대로 출력한다
        System.out.println("==============================");
        for(WashCourse w:WashCourse.values()){
            System.out.println(w.getLabel());
            System.out.println(w.getMinutes());
            System.out.println();
        }
        // 2. 모든 코스의 시간을 더하고 가장 긴 코스를 찾는다
        System.out.println("==============================");
        int total = 0;
        int maxCourse = 0;
        for(WashCourse w:WashCourse.values()){
            total+=w.getMinutes();
            maxCourse = Math.max(w.getMinutes(),maxCourse);
        }

        // 3. 전체 시간과 가장 긴 코스의 이름을 출력한다
        System.out.println("전체 시간 : "+ total);
        String lab ="";
        for(WashCourse w:WashCourse.values()){
            if(w.getMinutes() == maxCourse){
                lab = w.getLabel();
            }
        }
        System.out.println("가장 긴 코스 : "+lab);

    }
}
