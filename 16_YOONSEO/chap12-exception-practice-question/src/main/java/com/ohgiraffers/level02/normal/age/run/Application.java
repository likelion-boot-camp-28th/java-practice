package com.ohgiraffers.level02.normal.age.run;

import com.ohgiraffers.level02.normal.age.controller.AgeValidator;
import com.ohgiraffers.level02.normal.age.exception.InvalidAgeException;

public class Application {
    public static void main(String[] args) throws InvalidAgeException {

        /**
         * 나이 배열 {25, -3, 151, 0}을 차례로 검사한다.
         * 통과하면 <나이> : 통과, 예외가 나면 getMessage()의 결과를 출력한다.
         */

        // 1. 검사할 나이 배열과 AgeValidator 객체를 만든다
        int age[] = {25, -3, 151, 0};
        AgeValidator ageValidator =new AgeValidator();

        // 2. 나이마다 검사하고, 통과하면 통과 줄을, 예외가 나면 예외 메시지를 출력한다
        for(int i =0; i<age.length; i++){
            try{
                ageValidator.check(age[i]);
                System.out.println(age[i]+" : 통과");
            }catch (InvalidAgeException e){
                System.out.println(e.getMessage());
            }

        }

    }
}
