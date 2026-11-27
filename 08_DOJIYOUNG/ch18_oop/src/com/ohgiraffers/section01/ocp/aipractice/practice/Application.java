package com.ohgiraffers.section01.ocp.aipractice.practice;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        orderService.printOrder(1, new Customer("김하늘", new VipDiscount()), 18000 * 2);
        orderService.printOrder(2, new Customer("이준호", new GoldDiscount()), 22000);
        orderService.printOrder(3, new Customer("박서연", new NormalDiscount()), 25000);
    }
}
