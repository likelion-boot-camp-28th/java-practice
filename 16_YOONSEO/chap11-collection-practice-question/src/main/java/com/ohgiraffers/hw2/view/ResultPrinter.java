package com.ohgiraffers.hw2.view;
import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.ArrayList;
import java.util.List;

public class ResultPrinter {

    // list에 출력할 내용이 있으면 출력
    // list에 출력할 내용이 없으면 “게시물이 없습니다” 출력
    public void printAllList(ArrayList<BoardDTO> list) {
            if(list.isEmpty()){
                System.out.println("게시물이 없습니다.");
            }else{
                for(int i=0; i<list.size(); i++){
                    list.get(i);
                }
            }
    }

    // 전달받은 내용 출력
    public void printBoard(BoardDTO b) {
        System.out.println(b);
    }

    // 전달받은 문자열에 따라 실패내용 출력
    public void errorPage(String msg) {
        switch (msg){
            case "insertBoard":
                System.out.println("게시물 등록 실패");
                break;
            case "selectOne":
                System.out.println("조회된 글이 없습니다.");
                break;
            case "updateTitle":
                System.out.println("게시물 제목 수정 실패!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;

        }
    }

    // 전달받은 문자열에 따라 성공내용 출력
    public void successPage(String msg) {
        switch (msg){
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 성공!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 성공!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 성공!");
                break;

        }

    }

    public void noSearchResult() {
        System.out.println("검색 결과가 없습니다.");
    }
}
