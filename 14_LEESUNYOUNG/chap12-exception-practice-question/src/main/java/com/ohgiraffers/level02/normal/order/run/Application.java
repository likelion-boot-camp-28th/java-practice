package com.ohgiraffers.level02.normal.order.run;

import com.ohgiraffers.level02.normal.order.controller.OrderController;
import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class Application {
    public static void main(String[] args) {
        OrderController oc = new OrderController(new Inventory(5));

        try {
            oc.placeOrder(3);
            System.out.println("주문 성공");

        } catch (OutOfStockException e) {
            System.out.println("주문 실패 : " + e.getMessage());
        }finally {
            System.out.println("주문 처리 끝");
        }

        try {
            oc.placeOrder(10);
            System.out.println("주문 성공");

        } catch (OutOfStockException e) {
            System.out.println("주문 실패 : " + e.getMessage());
        }finally {
            System.out.println("주문 처리 끝");
        }
    }
}
