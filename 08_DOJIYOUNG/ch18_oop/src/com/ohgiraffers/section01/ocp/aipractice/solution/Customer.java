package com.ohgiraffers.section01.ocp.aipractice.solution;

import java.util.Objects;

public class Customer {

    private final String name;
    private final Grade grade;

    public Customer(String name, Grade grade) {
        this.name = Objects.requireNonNull(name);
        this.grade = Objects.requireNonNull(grade);
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
