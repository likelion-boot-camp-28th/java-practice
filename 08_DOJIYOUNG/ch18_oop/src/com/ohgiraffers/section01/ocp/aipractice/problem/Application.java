package com.ohgiraffers.section01.ocp.aipractice.problem;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        // 자바 설계 입문 2권, 알고리즘 첫걸음 1권, 테스트 주도 연습 1권
        orderService.printOrder(1, new Customer("김하늘", "VIP"), 18000 * 2);
        orderService.printOrder(2, new Customer("이준호", "GOLD"), 22000);
        orderService.printOrder(3, new Customer("박서연", "NORMAL"), 25000);
    }
}