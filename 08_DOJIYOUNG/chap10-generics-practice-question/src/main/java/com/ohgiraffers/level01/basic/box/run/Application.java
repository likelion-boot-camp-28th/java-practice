package com.ohgiraffers.level01.basic.box.run;

import com.ohgiraffers.level01.basic.box.model.Box;

public class Application {
    public static void main(String[] args) {
        // 1. Box<String>을 만들어 사과를 담는다
        Box<String> box = new Box<>();
        box.set("사과");

        // 2. Box<Integer>를 만들어 100을 담는다
        Box<Integer> ibox = new Box<>();
        ibox.set(100);

        // 3. 꺼낸 값을 형변환 없이 써서 글자 수와 덧셈 결과를 출력한다
        String fruit = box.get();
        int number = ibox.get();

        System.out.println(fruit +"(글자 수: " + fruit.length()+")");
        System.out.println("정수 상자: " + number+"(+50 = "+(number + 50)+ ")");

        /**
         * 실행화면
         * 문자열 상자 : 사과 (글자 수 2)
         * 정수 상자 : 100 (+50 = 150)
         * **/
    }
}
