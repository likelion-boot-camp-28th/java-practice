package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        /**
         * 다음과 같이 회원정보를 하나의 문자열로 존재
         * "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
         * - 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)
         * 각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다
         * 출력 메소드를 통해 회원정보를 출력함
         */
        String s = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        Member[] mem = new Member[3];

        for (int i = 0; i < mem.length; i++) {
            //문자열 분리해 회원객체에 담고 회원객체배열에 추가
            String[] s1 = s.split("\\|");
            String[] s2 = s1[i].split(","); // 회원 한명만 분리한 것

            int num = Integer.parseInt(s2[0]);
            String name = s2[1];
            int height = Integer.parseInt(s2[2]);
            int weight = Integer.parseInt(s2[3]);
            DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate date = LocalDate.parse(s2[4], f);

            mem[i] = new Member(num, name, height, weight, date);

        }

        for (int i = 0; i < mem.length; i++) {
            System.out.println(mem[i].information());
        }

    }
}
