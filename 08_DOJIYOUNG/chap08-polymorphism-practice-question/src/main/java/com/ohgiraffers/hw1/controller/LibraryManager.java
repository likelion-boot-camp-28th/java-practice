package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.ArrayList;

public class LibraryManager {

    private Member mem = null ;
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member m){
        mem = m;
    }

    public Member myInfo(){
        return mem;
    }

    public Book[] selectAll(){
        return bList;
    }

    public Book[] searchBook(String keyword){
         ArrayList<Book> result = new ArrayList<>();
         for(Book b: bList){
             if(b.getTitle().contains(keyword)){
                 result.add(b);
             }
         }

        return result.toArray(new Book[0]);
    }

    public int rentBook(int index){
        int result = 0;
        int mage = mem.getAge();
        Book book = bList[index];

        if(book instanceof AniBook){
            AniBook ani = (AniBook) book; // 다운 캐스팅
            if(mage<ani.getAccessAge()){
                result=1;
            }
        }else if( book instanceof CookBook){
            CookBook cook = (CookBook) book;
            if(cook.isCoupon()){
                mem.setCouponCount(mem.getCouponCount()+1);
            }
        }

        return result;
    }
}
