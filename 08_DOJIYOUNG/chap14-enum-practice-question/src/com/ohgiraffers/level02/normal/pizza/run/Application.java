package com.ohgiraffers.level02.normal.pizza.run;

import com.ohgiraffers.level02.normal.pizza.model.Topping;

import java.util.EnumSet;

public class Application {

    public static void main(String[] args) {
        // 1. 전체 토핑을 EnumSet으로 만들어 출력한다
        EnumSet<Topping> toppingEnumSet = EnumSet.allOf(Topping.class);
        System.out.println("== 전체 토핑 ==");
        printTopping(toppingEnumSet);

        // 2. 올리브와 치즈만 담은 EnumSet을 만들어 출력하고 합계를 출력한다
        EnumSet<Topping> toppingEnumSet2 =  EnumSet.of(Topping.OLIVE, Topping.CHEESE);
        System.out.println("== 고른 토핑  ==");
        printTopping(toppingEnumSet2);

        // 3. 고르지 않은 토핑을 EnumSet으로 만들어 출력한다
        EnumSet<Topping> toppingEnumSet3 =  EnumSet.complementOf(toppingEnumSet2);
        System.out.println("== 고르지 않은 토핑  ==");
        printTopping(toppingEnumSet3);

    }

    private static void printTopping(EnumSet<Topping> toppings){
        // 받은 토핑을 한 줄에 하나씩 <토핑 이름> : <N>원으로 출력한다.
        for(Topping t:toppings){
            System.out.println(t.getLabel() +" : "+ t.getPrice()+"원");
        }
    }

    private static int totalPirce(EnumSet<Topping> toppings){
        // 받은 토핑의 가격 합계를 반환한다.
        int total = 0;
        for(Topping t:toppings){
            total+=t.getPrice();
        }
        return total;
    }
}
