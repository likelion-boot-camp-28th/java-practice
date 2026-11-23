package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        boolean isWorking  = true;

        while(isWorking){
            System.out.println("""
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """);
            int user = sc.nextInt();
            switch (user){
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("정렬(1. 오름차순,2. 내림차순) : " );
                    int s = sc.nextInt();
                    bm.sortedBookList(s);
                    break;
                case 3:
                    System.out.print("삭제할 인덱스 : " );
                    int d = sc.nextInt();
                    bm.deleteBook(d);
                    break;
                case 4:
                    System.out.println("검색 도서 명 : ");
                    String t = sc.next();
                    int result= bm.searchBook(t);
                    System.out.println(result + "위치에서 찾음! ");
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    isWorking = false;
                    break;
                default:
                    System.out.println("1~6까지 숫자만");
                    break;
            }
        }
    }

    public BookDTO inputBook(){
         // int bNo, int category, String title, String author
        System.out.print("도서 번호 : >>");
        int bNo = sc.nextInt();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();

        System.out.print("도서 제목 : ");
        String title = sc.next();

        System.out.print("도서 저자 : ");
        String author = sc.next();

        return new BookDTO(bNo,category,title,author);

            // 도서 번호 : >> 임의 값 입
            // "도서 제목 : " >> 입력 받음
            // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
            // "도서 저자 : " >> 입력 받음
            // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
    }


//    public String inputBookTitle() {
//            // “도서 제목 : “ >> 입력 받음 >> 리턴
//    }


}
