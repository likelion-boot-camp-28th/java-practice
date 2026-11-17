package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;

public class Application {
    public static void main(String[] args) {
        System.out.println("== 전체 토핑 ==");
        printToppings(EnumSet.allOf(Topping.class));
        System.out.println("== 고른 토핑 ==");
        EnumSet<Topping> chosen = EnumSet.of(Topping.CHEESE,Topping.OLIVE);
        printToppings(chosen);
        System.out.println("고른 토핑 합계 : " + totalPrice(chosen));
        System.out.println("== 고르지 않은 토핑 ==");
        EnumSet<Topping>unchosen = EnumSet.complementOf(chosen);
        printToppings(unchosen);

    }
    private static void printToppings(EnumSet<Topping> toppings){
        for (Topping tp : toppings){
            System.out.println(tp.getLabel() + " : " + tp.getPrice() + "원");
        }
    }
    private static int totalPrice(EnumSet<Topping> toppings){
        int total = 0;
        for (Topping tp : toppings){
            total += tp.getPrice();
        }
        return total;
    }

}
