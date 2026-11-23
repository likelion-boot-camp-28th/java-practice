package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<BookDTO>();
    }

    // 전달받은 BookDTO객체를 생성당시 선언한 ArrayList객체에 추가
    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    // 달받은 도서 번호로 ArryaList 안에있는 정보 삭제
    public void deleteBook(int index) {
        bookList.remove(index);
    }


    // 전달받은 도서 제목으로 도서를 검색하고 결과값 반환
    public int searchBook(String bTitle) {
        //도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면, -1 리턴함
        int num = -1;
        for(int i =0; i<bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(bTitle)) {
                num = i;
                break;
            }
        }
        return num;
    }

    // 전달받은 인덱스에 있는 도서정보 출력
    public void printBook(int index) {
            if(index ==-1){
                System.out.println("조회한 도서가 없음");
            }else{
                System.out.println(bookList.get(index));
            }
    }

    // 도서목록 전체 출력
    public void displayAll() {
        if (bookList.isEmpty()) {

            System.out.println("출력할 도서가 없습니다");
        } else {
            for(int i =0; i<bookList.size(); i++){
                System.out.println(bookList.get(i));
            }
        }
    }

    // 전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서
//ArrayList<BookDTO>에 담아서 리턴
    public ArrayList<BookDTO> sortedBookList(int select) {
        if (select == 1) {
            // 해당 카테고리순 오름차순 정렬
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }
        return bookList;
    }

    // 전달 받은 ArrayList<BookDTO>를 향상된for문을 이용하여 출력
    public void printBookList(ArrayList<BookDTO> br) {
            for(BookDTO b : br){
                System.out.println(b);
            }
    }
}




