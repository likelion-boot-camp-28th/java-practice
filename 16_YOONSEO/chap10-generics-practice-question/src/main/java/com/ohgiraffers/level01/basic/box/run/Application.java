package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {
    public static void main(String[] args) {

        Box<String> apple = new Box<>();
        apple.put("사과");


        Box<Integer> num = new Box<>();
        num.put(100);

        // ***
        String apple2 = apple.get();
        int num2 = num.get();
        System.out.println("문자열 상자 : " + apple2 + " (글자 수" + apple2.length() + ")");
        System.out.println("정수 상자 : " + num2 + " (+50 = " + (num2 + 50) + ")");
    }
}
