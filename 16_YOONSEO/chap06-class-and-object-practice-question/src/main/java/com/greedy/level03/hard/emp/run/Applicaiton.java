package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Applicaiton {
    public static void main(String[] args) {

        EmployeeDTO e =new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        e.setNumber(sc.nextInt());
        e.setName(sc.next());
        e.setDept(sc.next());
        e.setJob(sc.next());
        e.setAge(sc.nextInt());
        e.setGender(sc.next().charAt(0));
        e.setSalary(sc.nextInt());
        e.setBonusPoint(sc.nextDouble());
        e.setPhone(sc.next());
        e.setAddress(sc.next());

        System.out.println(e.getNumber());
        System.out.println(e.getName());
        System.out.println(e.getDept());
        System.out.println(e.getJob());
        System.out.println(e.getAge());
        System.out.println(e.getGender());
        System.out.println(e.getSalary());
        System.out.println(e.getBonusPoint());
        System.out.println(e.getPhone());
        System.out.println(e.getAddress());


    }
}
