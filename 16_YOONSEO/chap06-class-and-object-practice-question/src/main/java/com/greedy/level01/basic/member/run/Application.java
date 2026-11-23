package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {
        MemberDTO m = new MemberDTO();      // 객체생성
        System.out.println("id : "+m.getId());
        System.out.println("pwd : "+m.getPwd());
        System.out.println("name : "+m.getName());
        System.out.println("age : "+m.getAge());
        System.out.println("gender : "+m.getGender());
        System.out.println("phone : "+m.getPhone());
        System.out.println("email : "+m.getEmail());

        m.setId("user01");
        m.setPwd("pass01");
        m.setName("홍길동");
        m.setAge(20);
        m.setGender('M');
        m.setPhone("010-1234-5678");
        m.setEmail("hong123@greedy.com");

        System.out.println("변경 후 id : "+m.getId());
        System.out.println("변경 후 pwd : "+m.getPwd());
        System.out.println("변경 후 name : "+m.getName());
        System.out.println("변경 후 age : "+m.getAge());
        System.out.println("변경 후 gender : "+m.getGender());
        System.out.println("변경 후 phone : "+m.getPhone());
        System.out.println("변경 후 email : "+m.getEmail());

    }
}
