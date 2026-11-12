package com.ohgiraffers.level02.normal.age.run;

import com.ohgiraffers.level02.normal.age.controller.AgeValidator;
import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

public class Application {
    public static void main(String[] args) {
        AgeValidator age = new AgeValidator();
        int[] ageStr = {25, -3, 151, 0};
            for (int i = 0; i < ageStr.length; i++){
                try {
                    age.check(ageStr[i]);
                    System.out.println(ageStr[i] + " : " + "통과");

                } catch (InvalidAgeException e) {
                    System.out.println(e.getMessage());
                }
            }

    }
}
