package com.ohgiraffers.section01.ocp.basic.locker.start;

public class Application {

    public static void main(String[] args) {

        /*
         * 비밀번호 4821로 만든 사물함을 여러 번 열어 본다.
         * 바깥 코드가 password 필드를 직접 읽어 출력하고, 다른 값으로 바꾸기도 한다.
         * */
        Locker locker = new Locker("4821");

        tryOpen(locker, "1234");
        tryOpen(locker, "4821");
        tryOpen(locker, "0000");
    }

    /* 입력한 글자로 사물함을 열어 보고 결과를 출력한다. 비밀번호 비교를 이 메소드가 직접 한다. */
    public static void tryOpen(Locker locker, String input) {

        // TODO 단계 2: 아래 if의 조건을 locker.open(input) 호출로 바꾼다
        if (locker.open(input)) {
            System.out.println(input + " 입력: 열림");
        } else {
            System.out.println(input + " 입력: 열리지 않음");
        }
    }
}