package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    //  members.ser 파일읽어서 출력하기
    public void  readMembers(){
        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader(new FileReader("members.ser"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // Member객체를 Member[]에 추가후, Member[]를 members.ser파일에 출력 작업
    public void addMember(Member member){
        File file = new File("members.ser");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(member.toString()+"\n");
                    System.out.println(" 파일의 내용이 변경되었습니다.");
       } catch (IOException e) {
             e.printStackTrace();
    }

    }
}

