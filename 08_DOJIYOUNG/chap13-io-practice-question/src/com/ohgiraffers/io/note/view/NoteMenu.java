package com.ohgiraffers.io.note.view;

import com.ohgiraffers.io.controller.FileController;

import java.util.Scanner;

public class NoteMenu {


    public void viewMenu() {

        Scanner sc = new Scanner(System.in);
        FileController fc = new FileController(); // 컨트롤러 객체 생성

        boolean isWorking = true;
        while(isWorking){
            System.out.println("""
                     ****** MyNote ******
                     1. 노트 새로 만들기
                     2. 노트 열기
                     3. 노트 열어서 수정하기
                     4. 끝내기
                     💛 번호를 입력 하세요 ➜
                    """);

            int userInput = sc.nextInt();

            switch (userInput){
                case 1:
                    fc.fileSave();
                    break;
                case 2:
                    fc.filOpen();
                    break;
                case 3:
                    fc.fileEdit();
                    break;
                case 4:
                    isWorking=false;
                    System.out.println("프로그램 종료 Bye 👋");
                    break;
                default:
                    System.out.println("잘못입력~");
                    break;
            }
        }

    }
}
