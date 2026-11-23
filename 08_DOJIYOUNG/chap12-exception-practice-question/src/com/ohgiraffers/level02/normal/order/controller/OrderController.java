package com.ohgiraffers.level02.normal.order.controller;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class OrderController
{
    private Inventory inventory;

    /**
     * 1. 주문 접수를 출력하고 reduce를 부른다.
     * 예외를 잡지 않고
     * 선언에 throws OutOfStockException을 붙여 부른 쪽으로 넘긴다.*/
    public OrderController(Inventory inventory) {
        this.inventory = inventory;
    }

    public void placeOrder(int qty){
        try {
            System.out.println("주문접수");
            System.out.println("재고확인");
            inventory.reduce(qty);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("주문처리끝");
        }
    }
}
