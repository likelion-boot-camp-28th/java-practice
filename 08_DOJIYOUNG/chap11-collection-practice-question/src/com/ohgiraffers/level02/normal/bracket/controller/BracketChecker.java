package com.ohgiraffers.level02.normal.bracket.controller;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketChecker {

    public boolean isVaild(String expr){
        /**
         * 식의 괄호가 모두 바르게 짝지어 열리고 닫혔으면 true, 아니면 false를 반환한다.
         * 소괄호·대괄호·중괄호를 검사하고, 괄호가 아닌 글자는 건너뛴다.
         * 안에서 Stack<Character>를 쓴다. static 메소드가 아니므로
         * new BracketChecker()로 만들어 부른다.*/
        Deque<Character> stack = new ArrayDeque<>();
        boolean r = true;

        for(int i =0; i<expr.length();i++){
            if(expr.charAt(i) == '(' ||expr.charAt(i) == '{' ||expr.charAt(i) == '['){
                stack.push('a');
            }
            if(expr.charAt(i) == ')' ||expr.charAt(i) == '}' ||expr.charAt(i) == ']'){
                if(stack.size()>0){
                    stack.pop();
                }else{
                    r=false;
                }
            }
        }

        if(stack.size()>0){
            r=false;
        }

        return r;

    }

}
