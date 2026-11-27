package com.ohgiraffers.section04.singleton.basic.attendance.start;

/* 출석한 학생 수를 센다. 싱글톤이 아니라서 필요한 만큼 만들 수 있다. 이 파일은 고치지 않는다. */
public class AttendanceCounter {

    private int count;

    public void check() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}