package com.ohgiraffers.section01.ocp.basic.newshape.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /*
         * 도형을 Shape 타입 목록에 담으면
         * 도형마다 변수와 출력 줄을 따로 두지 않아도 된다.
         * 목록 하나와 반복 한 번으로 넓이를 출력하고 더한다.
         * 객체를 변수에 담지 않고 바로 목록에 넣는다.
         * Rectangle과 Triangle은 Shape를 구현했으므로 같은 목록에 담을 수 있다.
         * 반복문은 목록의 도형이 무엇인지 묻지 않는다.
         * shape.area()는 담긴 객체의 계산식으로 넓이를 돌려준다.
         * */
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Triangle(6, 4));
        shapes.add(new Square(10));

        /*
         * 합계 변수는 반복 앞에 둔다.
         * 반복 안에서 선언하면 반복이 끝난 뒤 출력 줄에서 쓸 수 없다.
         * */
        int total = 0;
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " 넓이: " + shape.area());
            total = total + shape.area();
        }
        System.out.println("넓이 합계: " + total);
    }
}