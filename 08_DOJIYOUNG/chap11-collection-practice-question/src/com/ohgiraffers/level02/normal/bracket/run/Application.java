package com.ohgiraffers.level02.normal.bracket.run;

import com.ohgiraffers.level02.normal.bracket.controller.BracketChecker;

public class Application {
    public static void main(String[] args) {
        /**
         * 식 (a+b)*(c-d), (a+b)*(c-d), ((a+b), (a+b)), {[a+b]*(c)},(]
         * 를 배열에 담고 차례로 검사해
         * <식> : 올바름
         * 또는
         * <식> : 올바르지 않음을
         * 출력한다.*/

        BracketChecker bc = new BracketChecker();
        String[] strArr = new String[]{"(a+b)*(c-d)", "((a+b)", "(a+b))", "{[a+b]*(c)}","(]}"};

        for(String s : strArr){
            if(bc.isVaild(s)){
                System.out.println(s+" :  올바름");
            }else{
                System.out.println(s+" :  올바르지 않음");
            }
        }

    }
}
