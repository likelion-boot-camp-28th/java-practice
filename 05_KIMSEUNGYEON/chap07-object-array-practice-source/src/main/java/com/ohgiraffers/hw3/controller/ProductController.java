package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    ProductDTO[] pd = new ProductDTO[10];
    int pCount = 0;
    Scanner sc = new Scanner(System.in);

    public void meinManu() {

        int menuNum = 0;


        do {
            System.out.println("========= 제품 관리 메뉴 =========");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("원하시는 메뉴 번호를 입력해주세요 : ");
            menuNum = sc.nextInt();
            switch (menuNum) {

                case 1 :
                    System.out.println("제품 정보 추가");
                    productInput();
                    break;

                case 2 :
                    System.out.println("제품 전체 조회");
                    productPrint();
                    break;

                case 9 :
                    System.out.println("제품관리 프로그램을 종료합니다.");
                    break;
            }
        } while (menuNum != 9);

    }

    public void productInput() {
        System.out.print("제품 번호를 입력해주세요 :");
        int pNum = sc.nextInt();
        System.out.print("제품명을 입력해주세요 :");
        String pName = sc.next();
        System.out.print("제품 가격을 입력해주세요 :");
        int price = sc.nextInt();
        System.out.print("제품 세금을 입력해주세요 :");
        double tax = sc.nextDouble();

        pd[pCount] = new ProductDTO(pNum, pName, price, tax);
        pCount++;

        System.out.println("제품 등록에 성공했습니다.");
    }

    public void productPrint() {
        if(pCount == 0) {
            System.out.println("등록된 제품이 없습니다. 등록을 먼저 진행해주세요.");
        } else {
            for(int i = 0; i < pCount; i++) {
                System.out.println(pd[i].information());
            }
        }
    }
}
