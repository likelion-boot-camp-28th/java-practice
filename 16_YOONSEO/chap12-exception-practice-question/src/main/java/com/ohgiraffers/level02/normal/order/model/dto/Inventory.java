package com.ohgiraffers.level02.normal.order.model.dto;

import com.ohgiraffers.level02.normal.order.exception.OutOfStockException;

public class Inventory {
    private int stock; // 남은 재고

    public Inventory(int stock) {
        this.stock = stock;
    }

    /**
     * 2. 재고 확인을 출력한다.
     * 주문 수량이 재고보다 많으면 재고가 부족합니다.
     * 남은 재고: <N>개 메시지로 OutOfStockException을 던진다.
     * 그렇지 않으면 3. 재고 차감을 출력하고 재고에서 뺀다.
     * 선언에 throws OutOfStockException을 붙인다.
     */
    public void reduce(int qty) throws OutOfStockException {
        System.out.println("2. 재고 확인");
        if(qty>stock){
            throw new OutOfStockException("주문 실패 : 재고가 부족합니다. 남은 재고 : "+stock+"개");
        }else{
            System.out.println("3. 재고 차감");
            stock -= qty;
        }
    }
}
