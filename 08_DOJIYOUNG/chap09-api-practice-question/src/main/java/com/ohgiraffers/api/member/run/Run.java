package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.model.vo.Member;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {
    public static void main(String[] args) {
        String value = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
        String[] members = value.split("\\|");

        Member[] memberArr = new Member[members.length];
        int idx = 0;

        for(String member:members){
            String[] info = member.split(",");
            // Member(int memberNo, String memberName, int height, int weight, LocalDate birth)
            Member m = new Member(Integer.parseInt(info[0]),info[1]
                            ,Integer.parseInt(info[2]),Integer.parseInt(info[3])
                            ,LocalDate.parse(info[4], DateTimeFormatter.ofPattern("yyyyMMdd")));
            memberArr[idx] = m;
            idx++;
        }

        for(Member m : memberArr){
            System.out.println(m.information());
        }

    }
}
