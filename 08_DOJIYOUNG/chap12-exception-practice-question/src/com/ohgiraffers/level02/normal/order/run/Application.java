package com.ohgiraffers.level02.normal.order.run;

import com.ohgiraffers.level02.normal.order.controller.OrderController;
import com.ohgiraffers.level02.normal.order.model.dto.Inventory;

public class Application {
    public static void main(String[] args) {
        /**
         * 재고 5개로 시작해 3개 주문, 10개 주문을 차례로 처리한다.
         * 주문마다 성공하면 주문 성공,
         * 예외가 나면 주문 실패 : <메시지>를 출력하고,
         * finally로 주문 처리 끝을 출력한다.*/

        // 1. 재고 5개인 Inventory와 OrderController를 만든다
        Inventory inventory = new Inventory(5);
        OrderController orderController = new OrderController(inventory);

        // 2. 3개를 주문하고, 성공·실패를 출력한 뒤 finally로 처리 끝 줄을 출력한다
        orderController.placeOrder(3);

        // 3. 10개를 주문하고, 성공·실패를 출력한 뒤 finally로 처리 끝 줄을 출력한다
        orderController.placeOrder(10);
    }
}
