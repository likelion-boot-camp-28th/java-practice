package com.ohgiraffers.io.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {
    Scanner sc = new Scanner(System.in);
    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        System.out.print("저장할 파일명을 입력하시오 : (exit 입력 시 종료)");

        while (true) {
            String str = sc.nextLine();
            if (str.equals("exit")) {
                break;
            }
            sb.append(str + "\n");

        }
        System.out.print("저장하시겠습니까? (y/n) : ");
        String save = sc.nextLine();
        if (save.equalsIgnoreCase("y")) {
            String fileName = sc.nextLine();
            System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");

            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
                bw.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null) {
                        bw.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void fileOpen() {
        System.out.println("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName + ".txt"));
            while (true){
                String str = br.readLine();
                if (str == null){
                    break;
                }
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileEdit()  {
        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();
        BufferedReader br = null;
        BufferedWriter bw = null;
        StringBuilder sb = new StringBuilder();
        try {
            br = new BufferedReader(new FileReader(fileName + ".txt"));
            while (true){
                String str = br.readLine();
                if (str == null){
                    break;
                }
                System.out.println(str);
            }
            while (true) {
                String str = sc.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                sb.append(str + "\n");

            }
            System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
            String save = sc.nextLine();
            if (save.equalsIgnoreCase("y")) {
                bw = new BufferedWriter(new FileWriter(fileName + ".txt", true));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
