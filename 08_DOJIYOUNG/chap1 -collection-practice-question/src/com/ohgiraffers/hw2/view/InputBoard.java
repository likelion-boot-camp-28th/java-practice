package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc  = new Scanner(System.in);

    public BoardDTO inputBoard() {
        // int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent, int readCount
        // 게시글 등록
        // 글제목,작성자,글 내용(exit입력시 종료)는 각각 입력받기
       return new BoardDTO(inputBoardNo(),inputBoardTitle(),inputBoardWriter(), new Date(), inputBoardContent(),0);
    }

    public int inputBoardNo() {
        //제목을 입력받아서 리턴
        System.out.print("번호 입력 : ");
        return sc.nextInt();
    }

    public String inputBoardTitle() {
        //제목을 입력받아서 리턴
        System.out.print("제목 입력 : ");
        return sc.next();
    }

    public String inputBoardContent() {
        //내용을 입력받아서 리턴
        System.out.print("내용 입력 : ");
        return sc.next();
    }

    public String inputBoardWriter() {
        //내용을 입력받아서 리턴
        System.out.print("작성자 입력 : ");
        return sc.next();
    }
}


