package com.ohgiraffers.api.member.model.vo;

import java.time.LocalDate;

public class Member {
    /**
     * 다음과 같이 회원정보를 하나의 문자열로 존재
     * "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
     * - 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)
     * 각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다
     * 출력 메소드를 통해 회원정보를 출력함
     */


    private int memberNo;
    private String memberName;
    private int height;
    private int weight;
    private LocalDate birth;

    public Member(int memberNo, String memberName, int height, int weight, LocalDate birth) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
        this.birth = birth;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String information(){
        return memberNo+", "+memberName+", "+height+", "+weight+", "+birth;
    }
}
