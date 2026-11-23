package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm;
    Scanner sc = new Scanner(System.in);

    // 프로그램 실행 시 가장 먼저 호출되는 메소드
    // 회원이름, 나이, 성별을 입력받아  LibraryManager의 insertMember 메소드로 전달
    // 무한 반복 메뉴를 출력하여 각 메뉴 버튼 선택 시 해당 메소드 호출
    public void mainMenu() {
        System.out.println("회원정보 입력");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        Member mem = new Member(name, age, gender);
        // 이름, 나이, 성별 입력받아 Member객체 생성
        lm.insertMember(mem);
        // LibraryManager의 insertMember() 메소드에 전달

        int n = 0;
        do {
            System.out.println("====메뉴====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
                    break;

            }
        } while (n != 0);
    }

    // 결과 값을 Book[] 자료형으로 받아준 뒤 for문을 통해 도서 전체 목록 출력
    public void selectAll() {
        Book[] blist = lm.selectAll();

        for(int i=0; i<blist.length; i++){
            System.out.println(i+"번도서 : "+blist.title+ );
        }
    }

    // 검색할 제목 키워드 입력-> 결과값을 을 Book[] 자료형으로 받아준 뒤 향상된 for문을 이용하여 출력
    public void searchBook() {

    }

    // 대여할 도서 인덱스 입력받음 ->결과 값을 result로 받아
    // result가 0일 경우, 1일 경우, 2일 경우 각각에 해당하는 출력문 출력
    public void rentBook() {

    }


}
