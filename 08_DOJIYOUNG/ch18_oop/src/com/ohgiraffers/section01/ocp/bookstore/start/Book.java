package com.ohgiraffers.section01.ocp.bookstore.start;

/*
 * 서점에서 파는 도서 한 권을 나타내는 클래스다.
 * 필드는 모두 private으로 숨기고, 값은 get으로 시작하는 메소드로 읽는다.
 * 재고(stock)는 값만 가지고 있고, 이 장의 계산에는 쓰지 않는다.
 * */
public class Book {

    private String title;
    private int price;
    private int stock;

    // 생성자로 제목, 가격, 재고를 한 번에 받는다. 이 값을 바꾸는 메소드는 없다.
    public Book(String title, int price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    // 아래 세 메소드는 필드 값을 돌려주기만 한다.
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}