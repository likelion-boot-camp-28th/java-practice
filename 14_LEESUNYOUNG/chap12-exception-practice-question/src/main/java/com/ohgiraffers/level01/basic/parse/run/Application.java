package com.ohgiraffers.level01.basic.parse.run;

public class Application {
    public static void main(String[] args) {
        String[] str = {"10", "abc", "30", "4.5"};
        int total = 0;
        int count = 0;

        for (int i = 0; i<str.length; i++){
            try {
                total += Integer.parseInt(str[i]);
            } catch (NumberFormatException e) {
                System.out.println("변환 실패 : " + str[i]);
                count++;
            }
        }
        System.out.println("합계 : " + total);
        System.out.println("실패 건수 : " + count);
    }
}
