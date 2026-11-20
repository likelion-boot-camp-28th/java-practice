package com.ohgiraffers.level03.hard.fruit.run;

import com.ohgiraffers.level03.hard.fruit.controller.Juicer;
import com.ohgiraffers.level03.hard.fruit.model.Apple;
import com.ohgiraffers.level03.hard.fruit.model.Box;
import com.ohgiraffers.level03.hard.fruit.model.Fruit;
import com.ohgiraffers.level03.hard.fruit.model.Grape;

// 과일상자로 주스를 만들고, 빈상자에는 사과를 채움
public class Application {
    public static void main(String[] args) {
        /**
         * 사과를 담은 Box<Apple>과 포도를 담은 Box<Grape>로 주스를 만들어 결과를 한 줄씩 출력한다.
         * 빈 Box<Fruit>와 빈 Box<Object>에 사과를 채우고
         * Box<Fruit>에 사과 채움 : <상태>,
         * Box<Object>에 사과 채움 : <상태>를 출력한다.
         * 마지막으로 아무것도 넣지 않은 Box<String>의 상태를
         * 빈 상자 : <상태>로 출력한다.
         * 상태는 describe의 결과다.
         */

        // 1. 사과를 담은 Box<Apple>과 포도를 담은 Box<Grape>를 만든다
        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple());
        Box<Grape> grapeBox = new Box<>();
        grapeBox.put(new Grape());

        // 2. 두 상자로 주스를 만들어 출력한다
        Juicer juicer = new Juicer();
        System.out.println(juicer.makeJuice(appleBox));
        System.out.println(juicer.makeJuice(grapeBox));

        // 3. 빈 Box<Fruit>와 Box<Object>에 사과를 채우고 상태를 출력한다
        Box<Fruit> fruitBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        juicer.fillApple(fruitBox);
        juicer.fillApple(objectBox);
        System.out.println("Box<Fruit>에 사과 채움 : " + juicer.describe(fruitBox));
        System.out.println("Box<Object>에 사과 채움 : " + juicer.describe(objectBox));

        // 4. 아무것도 넣지 않은 상자의 상태를 출력한다
        Box<String> no = new Box<>();
        System.out.println("빈상자 : "+juicer.describe(no));
    }
}
