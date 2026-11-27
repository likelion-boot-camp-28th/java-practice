package com.ohgiraffers.section01.ocp.bookstore.start;

/* 주문 하나의 금액을 계산하고 결과를 출력하는 클래스다. */
public class OrderService {

    /*
     * 주문 하나를 처리한다.
     * 상품 금액, 할인 금액, 할인 뒤 금액, 배송비 순서로 계산해서 출력한다.
     * 배송비는 할인 뒤 금액이 30000원 이상이면 0원이고, 아니면 3000원이다.
     * */
    public void placeOrder(Customer customer, Book book, int quantity) {

        int amount = book.getPrice() * quantity;
        // int discount = calculateDiscount(customer, amount);

        DiscountPolicy discountPolicy = customer.getDiscountPolicy();
        int discount = discountPolicy.discount(amount);
        int afterDiscount = amount - discount;

        int shippingFee = 3000;
        if (afterDiscount >= 30000) {
            shippingFee = 0;
        }

        System.out.println("결제 금액: " + (afterDiscount + shippingFee));
        System.out.println("배송비: " + shippingFee);
        System.out.println("할인 금액: " + discount);
        System.out.println("주문 결과: 완료");
    }

//    public int calculateDiscount(Customer customer, int amount) {
//
//        // 등급 글자를 if로 비교해 할인 금액을 정한다.
//        // 어느 분기에도 맞지 않는 등급은 else로 가서 할인 금액이 0이 된다.
//        if (customer.getGrade().equals("VIP")) {
//            return amount * 10 / 100;
//        }else if (customer.getGrade().equals("GOLD")) {
//            return amount * 5 / 100;
//        }else if (customer.getGrade().equals("STUDENT")) {
//            return amount * 15 / 100;
//        }else {
//            return 0;
//        }
//    }
}