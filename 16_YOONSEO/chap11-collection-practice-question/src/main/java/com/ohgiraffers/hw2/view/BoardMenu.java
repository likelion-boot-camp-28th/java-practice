package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {

    Scanner sc = new Scanner(System.in);
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    //게시글 서비스 프로그램
    //메인 메뉴 출력, 각 메뉴에 해당하는 BoardManger클래스의 메소드 실행,
    // 도서에 대한 정보는 InputBoard클래스의 메소드를 호출하여 사용 -> 반복 출력
    public void mainMenu() {
        int num;
        do {
            System.out.println("===게시글 서비스 프로그램===");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체보기");
            System.out.println("3. 게시글 한개보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");

            System.out.print("메뉴번호 선택 : ");
            num = sc.nextInt();

            switch (num) {
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
                    bm.updateBoardTitle(ib.inputBoardNo(), ib.inputBoardTitle());
                    break;
                case 5:
                    bm.updateBoardContent(ib.inputBoardNo(), ib.inputBoardContent());
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
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("잘못입력하였습니다. 다시 입력하세요");
                    break;
            }

        } while (num != 9);
    }

    //게시글 정렬메뉴
    //(정렬은 오름차순,내림차순)
    //정렬대상: 글번호,날짜,제목
    public void sortSubMenu() {
        while (true) {
            System.out.println("===게시글 정렬 메뉴===");
            System.out.println("1. 글번호순 오름차순 정렬");
            System.out.println("2. 글번호순 내림차순 정렬");
            System.out.println("3. 작성날짜순 오름차순 정렬");
            System.out.println("4. 작성날짜순 내림차순 정렬");
            System.out.println("5. 글제목순 오름차순 정렬");
            System.out.println("6. 글제목순 내림차순 정렬");
            System.out.println("7. mainMenu()메소드로 이동");
            int m = sc.nextInt();

            switch (m) {
                case 1:
                    bm.sortList(new AscBoardNo());
                    break;
                case 2:
                    bm.sortList(new DescBoardNo());
                case 3:
                    bm.sortList(new AscBoardDate());
                case 4:
                    bm.sortList(new DescBoardDate());
                case 5:
                    bm.sortList(new AscBoardTitle());
                case 6:
                    bm.sortList(new DescBoardTitle());
                case 7:
                    return;
            }

        }

    }

}
