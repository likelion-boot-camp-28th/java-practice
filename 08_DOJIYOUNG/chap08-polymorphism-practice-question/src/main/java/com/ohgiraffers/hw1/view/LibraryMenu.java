package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("나이 : ");
        int age = sc.nextInt();

        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        lm.insertMember(new Member(name,age,gender));

        boolean loop = true;

        while(loop){
            System.out.println("""
                    ==== 메뉴 ====
                    1. 마이페이지
                    2. 도서 전체 조회
                    3. 도서 검색
                    4. 도서 대여하기
                    0. 프로그램 종료하기
                    """);
            int userpick = sc.nextInt();
            switch (userpick){
                case 1:
                    System.out.println(lm.myInfo().toString());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    System.out.print("검색할 키워드 : ");
                    String kw = sc.next();
                    searchBook(kw);
                    break;
                case 4:
                    selectAll();
                    System.out.print("대여할 도서 번호 선택 : ");
                    int ix = sc.nextInt();
                    rentBook(ix);
                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("잘못된 번호 입력함.");

            }
        }
        /** 무한 반복 메뉴를 출력하여 각 메뉴 선택시 해당 메소드 호출..?**/
    }

    public void selectAll(){

        Book[] blist = lm.selectAll();

        for(int i=0; i<blist.length; i++){
            System.out.print(i+1+"번 도서 : ");
            System.out.println(blist[i].toString());
        }
    }

    public void searchBook(String keyword){
        Book[] blist = lm.searchBook(keyword);

        for(Book b: blist){
            System.out.println(b.toString());
        }
    }

    public void rentBook(int idx){
        int result = lm.rentBook(idx);
        switch (result){
            case 0:
                System.out.println("성공적 대여");
                break;
            case 1:
                System.out.println("나이제한으로 대여 불가능");
                break;
            case 2:
                System.out.println("성공적 대여, 요리학원 쿠폰 발급, 마이페이지 확인하삼");
                break;
            default:
                System.out.println("잘못입력!");
        }
    }



}
