package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    Scanner sc = new Scanner(System.in);


    public void fileSave() {
        System.out.print("새로운 파일을 만드시겠습니까? y/n : " );
        String save = sc.nextLine();

        if(save.equalsIgnoreCase("y")) {
            System.out.println(" == 새로운 노트 생성하기 == ");
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;

            try{
                bw = new BufferedWriter(new FileWriter(fileName+".txt"));
                System.out.println("저장할 내용을 입력하시오 (exit 입력시 종료)");
                while(true){
                    String line = sc.nextLine();
                    if(line.equals("exit")) break;
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            }catch(IOException e) {
                e.printStackTrace();
            }finally {
                if(bw != null){
                    try{
                        bw.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

            }
        }

    }


    public void filOpen() {
        System.out.println(" == 노트 열기 == ");
        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        BufferedReader reader;

        try {
            reader = new BufferedReader((new FileReader(fileName+".txt")));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
        }
    }

    public void fileEdit() {
        System.out.println(" == 노트 열고 수정하기 == ");
        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();

        File file = new File(fileName + ".txt");
        if (!file.exists()) {
            System.out.println(fileName + " < 없음! ");
            return;
        }

        try {
            System.out.println("파일에 추가할 내용을 입력하시오 (exit 입력시 종료)");
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = sc.nextLine();
                if (line.equals("exit")) break;
                sb.append(line).append("\n");
            }

            System.out.print("최종 저장 하시겠습니까? y/n ");
            String save = sc.nextLine();

            if (save.equalsIgnoreCase("y")) {
                // true → 덮어쓰지 않고 파일 끝에 이어쓰기(append)
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                    bw.write(sb.toString());
                    System.out.println(fileName + " 파일의 내용이 변경되었습니다.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
