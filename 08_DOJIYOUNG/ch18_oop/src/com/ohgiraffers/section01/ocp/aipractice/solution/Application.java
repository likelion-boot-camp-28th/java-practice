package com.ohgiraffers.section01.ocp.aipractice.solution;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        // 주문 1: 자바 설계 입문(18000원) 2권
        orderService.order(1, new Customer("김하늘", Grade.VIP), 18000 * 2).print();
        // 주문 2: 22000원
        orderService.order(2, new Customer("이준호", Grade.GOLD), 22000).print();
        // 주문 3: 25000원
        orderService.order(3, new Customer("박서연", Grade.NORMAL), 25000).print();
    }
}
