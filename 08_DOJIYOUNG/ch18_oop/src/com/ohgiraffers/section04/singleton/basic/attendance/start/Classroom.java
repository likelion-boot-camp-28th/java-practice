package com.ohgiraffers.section04.singleton.basic.attendance.start;

/* 교실 하나다. 쓸 출석 카운터를 생성자로 받는다. 이 파일은 고치지 않는다. */
public class Classroom {

    private String name;
    private AttendanceCounter counter;

    public Classroom(String name, AttendanceCounter counter) {
        this.name = name;
        this.counter = counter;
    }

    public void attend() {
        counter.check();
    }

    public void report() {
        System.out.println(name + " 출석: " + counter.getCount());
    }
}