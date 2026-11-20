package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    private BookManager bm =new BookManager();

    // 기본 생성자
    public BookMenu() {
    }

    // 도서관리 프로그램에 해당하는 메인 메뉴 출력, 각 메뉴에 해당하는 BookManager클래스의 메소드 실행
    // -> 반복출력
    public void menu() {
        int n = 0;
        do {
            System.out.println("===도서 관리 프로그램===");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    BookDTO bd = inputBook();
                    bm.addBook(bd);
                    break;
                case 2:
                    System.out.print("정렬방식을 선택해주세요 (1.오름차순, 2. 내림차순)");
                    int m = sc.nextInt();
                    if (m == 1 || m == 2) {
                        bm.printBookList(bm.sortedBookList(m));
                    } else {
                        System.out.println("번호를 잘못입력하셨습니다");
                    }
                    break;
                case 3:
                    int p;
                    System.out.print("삭제할 도서의 인데스를 입력하시오 : ");
                    p = sc.nextInt();
                    bm.deleteBook(p);
                    break;
                case 4:
                    bm.printBook(bm.searchBook(inputBooKTitle()));
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("번호를 잘못입력하였습니다");
            }
        }
        while (n != 6);

    }

    // BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴
    public BookDTO inputBook() {

        System.out.println("도서 번호 : ");
        String dno = sc.next();
        System.out.println("도서 제목 :");
        String title = sc.next();
        System.out.print("도서장르(1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.print("도서 저자 : ");
        String author = sc.next();
        BookDTO bDTO = new BookDTO(dno, category, title, author);
        return bDTO;
    }

    //  검색할 도서제목을 키보드로 입력 받아 리턴
    public String inputBooKTitle() {
        System.out.print("검색할 도서제목 : ");
        String s = sc.next();
        return s;
    }
}
