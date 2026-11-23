package com.ohgiraffers.hw2.view;


import com.ohgiraffers.hw2.controller.BoardManager;

import java.util.Scanner;

public class BoardMenu {

    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        boolean isWorking= true;

        while(isWorking){
            System.out.println("""
                *** 게시글 서비스 프로그램 ***
                1. 게시글 쓰기 // insertBoard(inputBoard()이 리턴한 객체) 실행
                2. 게시글 전체보기 // selectAllList() 실행
                3. 게시글 한 개보기 // selectOneBoard(inputBoardNo()) 실행
                4. 게시글 제목 수정 // updateBoardTitle(inputBoardNo(),inputBoardTitle()) 실행
                5. 게시글 내용 수정 // updateBoardContent(inputBoardNo(),inputBoardContent()) 실행
                6. 게시글 삭제 // deleteBoard(inputBoardNo()) 실행
                7. 게시글 제목 검색 // searchBoard(inputBoardTitle()) 실행
                8, 정렬하기 // sortSubMenu() 실행
               9. 끝내기 // “프로그램이 종료되었습니다.” 출력
                """);
            int user = sc.nextInt();
            switch(user){
                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;
                case 2:
                    bm.selectAllList();
                    break;
                case 3:
                    bm.selectOneBoard(ib.inputBoardNo());
                    break;
                case 4:
                    bm.updateBoardTitle(ib.inputBoardNo(),ib.inputBoardTitle());
                    break;
                case 5:
                    bm.updateBoardContent(ib.inputBoardNo(),ib.inputBoardContent());
                    break;
                case 6:
                    bm.deleteBoard(ib.inputBoardNo());
                    break;
                case 7:
                    bm.searchBoard(ib.inputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    isWorking = false;
                    break;
                default:
                    System.out.println("1~9까지 다시 입력");
                    break;

            }
        }
    }

    public void sortSubMenu() {
        System.out.println("""
                ***** 게시글 정렬 메뉴 *****
                1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
                2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
                3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
                4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
                5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
                6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
                7. mainMenu()메소드로 이동
                """);
        int user = sc.nextInt();
        switch (user) {
            case 1:
                bm.selectAllList();
                bm.sortList(new AscBoardNo());
                break;
            case 2:
                bm.selectAllList();
                bm.sortList(new DescBoardNo());
                break;
            case 3:
                bm.selectAllList();
                bm.sortList(new AscBoardDate());
                break;
            case 4:
                bm.selectAllList();
                bm.sortList(new DescBoardDate());
                break;
            case 5:
                bm.selectAllList();
                bm.sortList(new AscBoardTitle());
                break;
            case 6:
                bm.selectAllList();
                bm.sortList(new DescBoardTitle());
                break;
            case 7:
                mainMenu();
                break;
            default:
                break;

        }
    }
}
