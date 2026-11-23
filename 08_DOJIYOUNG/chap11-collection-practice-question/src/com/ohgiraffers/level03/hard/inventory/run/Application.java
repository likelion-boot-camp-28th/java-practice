package com.ohgiraffers.level03.hard.inventory.run;

import com.ohgiraffers.level03.hard.inventory.controller.InventoryManager;
import com.ohgiraffers.level03.hard.inventory.model.comparator.NameAscending;
import com.ohgiraffers.level03.hard.inventory.model.comparator.PriceDescending;
import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        InventoryManager im = new InventoryManager();

        // 1. 상품 6개를 InventoryManager에 넣는다
        im.addItem(new ItemDTO("P104","노트","문구",3000,50));
        im.addItem(new ItemDTO("P101","무선 마우스","전자",25000,10));
        im.addItem(new ItemDTO("P106","볼펜","문구",1500,0));
        im.addItem(new ItemDTO("P103","키보드","전자",45000,5));
        im.addItem(new ItemDTO("P102","텀블러","생활",18000,0));
        im.addItem(new ItemDTO("P105","수건","생활",8000,20));

        // 2. 재고가 0인 상품을 지우고 지운 개수를 출력한다
        int removeCnt  = im.removeSoldOut();
        System.out.println("재고 없어서 지운 것 개수 : " +removeCnt);

        // 3. 코드순, 가격 높은 순, 이름순 목록을 차례로 출력한다
        System.out.println("-- 코드순 --");
        for(ItemDTO item : im.sortedByCode()){
            System.out.println(item.toString());
        }

        System.out.println("-- 가격 높은 순 -- ");
        for(ItemDTO item : im.sortedBy(new PriceDescending())){
            System.out.println(item.toString());
        }

        System.out.println("-- 이름 순 -- ");
        for(ItemDTO item : im.sortedBy(new NameAscending())){
            System.out.println(item.toString());
        }



        // 4. 분류별 재고 합계를 분류 이름순으로 출력한다
        Map<String,Integer> sumByCate =  im.sumByCategory();
        for(String k:sumByCate.keySet()){
            System.out.println("분류 : "+k +" , 합계 : " +sumByCate.get(k));
        }
    }
}
