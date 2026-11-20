package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] st = new StudentDTO[3];    // 학생 객체 배열크기 3
        st[0] = new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        st[1] = new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        st[2] = new StudentDTO("강개순",23,167.0,45.0,4,"정보통신공학과");
        for(StudentDTO e : st){
            System.out.println(e.information());
        }

        System.out.println("============================");

        Scanner sc =new Scanner(System.in);
        EmployeeDTO[] em = new EmployeeDTO[10];
        char ch;
        int n =0;
        do{
            em[n] =new EmployeeDTO(); // 객체 생성
            em[n].setName(sc.next());
            sc.nextLine();
            em[n].setAge(sc.nextInt());
            em[n].setHeight(sc.nextDouble());
            em[n].setWeight(sc.nextDouble());
            em[n].setSalary(sc.nextInt());
            em[n].setDept(sc.next());
            System.out.print("계속 입력하시겠습니까?");
            ch=sc.next().charAt(0);
            n++;
        }while( ch=='y' || ch=='Y');

        for(int i=0; i<n; i++){
            System.out.println(em[i].information());
        }
    }
}
