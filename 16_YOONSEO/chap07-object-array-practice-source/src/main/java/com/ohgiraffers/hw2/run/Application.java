package com.ohgiraffers.hw2.run;

import com.ohgiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO st[] = new StudentDTO[10];
        int count =0;
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            st[count] = new StudentDTO();
            st[count].setGrade(sc.nextInt());
            st[count].setClassroom(sc.nextInt());
            st[count].setName(sc.next());
            sc.nextLine();
            st[count].setKor(sc.nextInt());
            st[count].setEng(sc.nextInt());
            st[count].setMath(sc.nextInt());
            System.out.print("계속 추가하시겠습니다?");
            ch = sc.next().charAt(0);
            count++;
        }while(ch== 'y' || ch=='Y');

        for(int i =0; i<count;i++){
            int avg = ((st[i].getKor()+st[i].getEng()+st[i].getMath())/3);
            System.out.print(st[i].information());
            System.out.println(", "+avg);
        }
    }
}
