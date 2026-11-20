package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bDto = new BookDTO();   // 기본값 넣은 것
        System.out.println(bDto.getTitle()+", "+bDto.getPublisher()+", "+
                bDto.getAuthor()+", "+bDto.getPrice()+", "+bDto.getDiscountRate());

        BookDTO bDto2 = new BookDTO("자바의 정석", "도우출판","남궁성");
        System.out.println(bDto2.getTitle()+", "+bDto2.getPublisher()+", "+
                bDto2.getAuthor()+", "+bDto2.getPrice()+", "+bDto2.getDiscountRate());

        BookDTO bDto3 = new BookDTO("홍길동전", "활빈당","허균",5000000,0.5);
        System.out.println(bDto3.getTitle()+", "+bDto3.getPublisher()+", "+
                bDto3.getAuthor()+", "+bDto3.getPrice()+", "+bDto3.getDiscountRate());

    }

}
