package com.ohgiraffers.level02.normal.order.controller;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class OrderController {
    private Inventory inventory;    // 주문을 받을 재고

    public OrderController(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * 1. 주문 접수를 출력하고 reduce를 부른다.
     * 예외를 잡지 않고 선언에 throws OutOfStockException을 붙여 부른 쪽으로 넘긴다.
     */
    public void placeOrder(int qty) throws OutOfStockException {
        System.out.println("1. 주문 접수");
        inventory.reduce(qty);
    }
}
