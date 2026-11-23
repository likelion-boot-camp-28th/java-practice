package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);

    //게시글 등록:
    //BoardDTO객체를 생성하여 글제목,작성자,를 입력받고,글내용도 입력을 받는다.
    //글작성은 한번 입력 받을때마다 줄바꿈적용, “exit”키워드를 입력받으면 글작성을 종료한다.
    //날짜는 현재날짜로 등록
    public BoardDTO inputBoard() {
        System.out.println("===새 게시글 쓰기===");
        BoardDTO b = new BoardDTO();

        System.out.println("글 제목 :");
        String title = sc.nextLine();
        b.setBoardTitle(title);

        System.out.println("작성자 :");
        String writer = sc.nextLine();
        b.setBoardWriter(writer);

        Date date = new Date();
        b.setBoardDate(date);

        System.out.println("글 내용(exit 입력시 종료) : ");
        String content="";
        while (true){
            String str = sc.nextLine();
            if(str.equals("exit")) break;
            content += str+"\n";
        }
        b.setBoardContent(content);
        return b;

    }

    // 글번호를 입력받아 리턴
    public int inputBoardNo() {
        System.out.print("글번호 입력 :");
        return sc.nextInt();
    }

    // 제목을 입력받아 리턴
    public String inputBoardTitle() {
        System.out.print("제목 입력 : ");
        return sc.next();
    }

    //내용을 입력받아 리턴
    public String inputBoardContent() {
        System.out.println("내용 입력 : ");
        return sc.nextLine();
    }
}
