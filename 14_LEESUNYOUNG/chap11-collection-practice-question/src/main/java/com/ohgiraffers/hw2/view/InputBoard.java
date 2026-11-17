package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);
    public BoardDTO inputBoard(){
        String title = inputBoardTitle();
        System.out.print("작성자 : ");
        String writer = sc.nextLine();

        String content = inputBoardContent();
        return new BoardDTO(0, title, writer, new Date(), content, 0);
    }


    public int inputBoardNo(){
        System.out.println("게시글 번호 : ");
        int boardNo = sc.nextInt();
        sc.nextLine();
        return boardNo;
    }

    public String inputBoardTitle(){
        System.out.println("게시글 제목 : ");
        return sc.nextLine();
    }

    public String inputBoardContent(){
        System.out.println("게시글 내용을 입력하세요. 끝내려면 exit를 입력하세요.");
        StringBuilder content = new StringBuilder();

        while (true){
            String line = sc.nextLine();

            if (line.equals("exit")){
                break;
            }
            content.append(line).append(System.lineSeparator());
        }
        return content.toString();
    }
}
