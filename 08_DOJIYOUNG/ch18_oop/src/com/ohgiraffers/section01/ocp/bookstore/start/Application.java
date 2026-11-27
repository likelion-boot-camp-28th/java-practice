package com.ohgiraffers.section01.ocp.bookstore.start;

public class Application {

    public static void main(String[] args) {

        /* 도서 세 권을 만든다. 값은 이름, 가격, 재고 순서다. */
        Book javaBook = new Book("자바 설계 입문", 18000, 10);
        Book algorithmBook = new Book("알고리즘 첫걸음", 22000, 3);
        Book testBook = new Book("테스트 주도 연습", 25000, 5);

        /* 고객마다 주문을 하나씩 넣는다. 할인은 고객 등급에 따라 달라진다. */
        OrderService orderService = new OrderService();

        System.out.println("[주문 1] 김하늘");
        Customer kim = new Customer("김하늘", new VipDiscount());
        orderService.placeOrder(kim, javaBook, 2);

        System.out.println("[주문 2] 이준호");
        Customer lee = new Customer("이준호", new GoldDiscount());
        orderService.placeOrder(lee, algorithmBook, 1);

        System.out.println("[주문 3] 박서연");
        Customer park = new Customer("박서연", new NoDiscount());
        orderService.placeOrder(park, testBook, 1);


        System.out.println("[주문 4] 최민준");
        Customer choi = new Customer("최민준", new StudentDiscount());
        orderService.placeOrder(choi, javaBook, 1);
    }
}