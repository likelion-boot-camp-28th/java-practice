package com.ohgiraffers.section01.ocp.aipractice.problem;

public class Customer {

    private String name;
    private String grade;

    public Customer(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}