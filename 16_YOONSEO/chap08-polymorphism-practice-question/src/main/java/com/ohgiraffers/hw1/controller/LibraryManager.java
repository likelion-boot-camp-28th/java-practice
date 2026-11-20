package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    // 초기화 블록
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }


    // 전달받은 mem 주소값을 통해 LibraryManager의 mem에 대입
    public void insertMember(Member mem) {
            this.mem = mem;
    }

    // ***
    //회원 레퍼런스(mem) 주소값 리턴
    public Member myInfo() {
        return ;
    }

    // ***
    //도서 전체 목록 (bList) 주소값 리턴
    public Book[] selectAll() {
        return;
    }

    //전달받은 키워드가 포함된 도서가 여러 개가 존재할 수 있으니
    // 검색된 도서를 담아줄 Book 객체 배열을 새로 생성
    // for문을 통해 bList 안의 도서들과 전달받은 키워드를 비교하여
    // 포함하고있는 경우 새로운 배열에 차곡차곡 담기
    //→ 그 배열 주소 값 리턴
    public Book[] searchBook(String keyword) {
        return;
    }

    // result를 0으로 초기화하고, 전달받은 인덱스의 도서가 만화면 회원나이와 만화제한나이 비교
    // 회원나이가 더 적으면 result를 1로 초기화
    // 아니면 인덱스의 도서가 요리책인경우 요리책의 쿠폰 유무가 유일하면 couponCount+1, result 2로 초기화
    // result값 리턴
    public int rentBook(int index) {
        int result =0;

        return result;
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

}
