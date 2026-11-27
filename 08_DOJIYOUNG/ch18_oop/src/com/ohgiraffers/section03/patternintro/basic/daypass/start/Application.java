package com.ohgiraffers.section03.patternintro.basic.daypass.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* 출입기는 오늘 온 회원의 회원권을 목록에 담아 차례로 들여보낸다. */
        // TODO 단계 1: 같은 패키지에 Pass를 구현하는 1일권 클래스 DayPass를 만든다
        List<Pass> passes = new ArrayList<>();
        passes.add(new CountPass("김하늘", 10));
        passes.add(new MonthPass("박구름"));
        // TODO 단계 2: 최바람의 1일권을 목록에 넣는 줄을 더한다
        passes.add(new DayPass("최바람"));

        for (Pass pass : passes) {
            pass.use("출입기");
        }
    }
}