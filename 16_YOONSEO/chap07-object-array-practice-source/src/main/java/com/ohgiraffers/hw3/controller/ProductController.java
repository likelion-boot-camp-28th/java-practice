package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro = null;
    public static int count =0;  // 현재 추가된 객체 수
    Scanner sc = new Scanner(System.in);

    // 초기화블록에 10개의 Product 배열 크기 할당
    {
        pro = new ProductDTO[10];
    }

    public void mainMenu(){
        // do~while 문을 이용하여 반복적으로 메뉴화면 출력
        // 각 버튼 선택 시 각각의 메소드 호출4
        int n =0;

        do{
            System.out.println("====제품 관리 메뉴====");
            System.out.println("1. 제품 정보 추가");  // productInput() 메소드 실행
            System.out.println("2. 제품 전체 조회");  // productPrint() 메소드 실행
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴선택 : ");
            n = sc.nextByte();

            switch (n){
                case 1 :
                    productInput();
                    break;
                case 2 :
                    productPrint();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");

            }
        }while(n!=9);
    }

    public void productInput(){
        // 새로운 제품 정보 기록을 위해 키보드로 정보들을 입력 받아
        // 객체를 생성하고 현재 카운트 인덱스에 주소 저장
        System.out.print("제품번호 : ");
        int id = sc.nextInt();
        System.out.print("제품명 : ");
        String name = sc.next();
        System.out.println("제품가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(id, name, price,tax);

    }

    public void productPrint(){
        // 현재까지 기록된 도서 정보 모두 출력
        for(int i =0; i<count; i++){
            System.out.println(pro[i].information());
        }
    }
}
