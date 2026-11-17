package com.ohgiraffers.level02.normal.bracket.run;

import com.ohgiraffers.level02.normal.bracket.controller.BracketChecker;

public class Application {

    public static void main(String[] args) {
        String[] str = {"(a+b)*(c-d)", "((a+b)", "(a+b))", "{[a+b]*(c)}", "(]"};

        BracketChecker bracketChecker = new BracketChecker();
        for(String expr : str){
            if (bracketChecker.isValid(expr)){
                System.out.println(expr + " : 올바름");
            }else {
                System.out.println(expr + " : 올바르지 않음");
            }
        }
    }
}
