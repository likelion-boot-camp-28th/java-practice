package com.ohgiraffers.section01.ocp.basic.plant.start;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        /* count는 물을 준 화분 수를 센다. */
        int count = 0;

        // TODO 단계 4: 두 목록을 List<Plant> 하나로, 두 반복문을 반복문 하나로 바꾼다
//        List<Rose> roses = new ArrayList<>();
//        roses.add(new Rose("창가"));
//        roses.add(new Rose("베란다"));
//
//        List<Cactus> cactuses = new ArrayList<>();
//        cactuses.add(new Cactus("책상"));

        List<Plant> plants = new ArrayList<>();
        plants.add(new Rose("창가"));
        plants.add(new Rose("베란다"));
        plants.add(new Cactus("책상"));

//        for (Rose rose : roses) {
//            rose.water();
//            count = count + 1;
//        }
//        for (Cactus cactus : cactuses) {
//            cactus.water();
//            count = count + 1;
//        }
        for(Plant p:plants){
            p.water();
            count+=1;
        }
        System.out.println("물 준 화분: " + count + "개");
    }
}