package com.ohgiraffers.section01.ocp.basic.shape.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * 도형마다 변수와 출력 줄이 따로 있다.
         * 도형이 늘면 출력 줄과 합계 식을 모두 고쳐야 한다.
         * */
//        Rectangle rectangle = new Rectangle(4, 5);
//        Triangle triangle = new Triangle(6, 4);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Triangle(6, 4));

        // TODO 단계 4: 두 도형을 List<Shape>에 담고, 반복 한 번으로 넓이를 출력하고 합계를 구한다
        int sum = 0;
        for(Shape s:shapes){
            System.out.println("이름 : "+s.getName() +", 넓이 : " +s.area());
            sum+=s.area();
        }

        System.out.println("넓이 합계: " + sum);
    }
}