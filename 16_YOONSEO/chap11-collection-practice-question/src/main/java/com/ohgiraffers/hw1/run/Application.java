package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.view.BookMenu;

public class Application {
    public static void main(String[] args) {
        // BookMenu 클래스 객체 생성하고 menu() 메소드 실행
        BookMenu bm = new BookMenu();
        bm.menu();

        // 위 내용 한줄로도 작성가능
        // new BookMenu.menu();

    }
}
