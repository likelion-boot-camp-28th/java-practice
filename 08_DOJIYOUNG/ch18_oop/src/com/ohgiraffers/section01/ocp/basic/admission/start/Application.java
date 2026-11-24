package com.ohgiraffers.section01.ocp.basic.admission.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* total은 입장료 합계를 모은다. */
        // TODO 단계 2: 배열과 반복문을 List<AgeGroup> 목록과 반복문으로 바꾼다
        // String[] visitors = {"어린이", "어른", "어린이"};
        List<AgeGroup> ageGroupList = new ArrayList<>();
        ageGroupList.add(new Child());
        ageGroupList.add(new Adult());
        ageGroupList.add(new Child());
        ageGroupList.add(new Teen());

        int total = 0;
        for (AgeGroup ag : ageGroupList) {
            System.out.println(ag.getName() + " 입장료: " + ag.getFee());
            total = total +ag.getFee();
        }
        System.out.println("입장료 합계: " + total);
    }


}