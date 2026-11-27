package com.ohgiraffers.section04.singleton.basic.attendance.start;

public class Application {

    public static void main(String[] args) {

        /* 교실마다 출석 카운터를 하나씩 만들어 생성자로 넘긴다. */
        AttendanceCounter counter1 = new AttendanceCounter();
        // TODO 단계 2: 쓰지 않게 된 이 줄을 지운다
        //AttendanceCounter counter2 = new AttendanceCounter();
        AttendanceCounter counter3 = new AttendanceCounter();

        Classroom class1 = new Classroom("1반", counter1);
        // TODO 단계 1: 2반이 1반과 같은 카운터를 쓰도록 아래 줄에서 넘기는 카운터를 바꾼다
        Classroom class2 = new Classroom("2반", counter1);
        Classroom class3 = new Classroom("3반", counter3);

        class1.attend();
        class1.attend();
        class2.attend();
        class3.attend();

        class3.report();
        class1.report();
        class2.report();
    }
}