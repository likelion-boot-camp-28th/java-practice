package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {
    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    private ResultPrinter rp = new ResultPrinter()1;

    public BoardManager() {
    }

    /* 새 게시글 등록용 메소드 */
    public void insertBoard(BoardDTO b) {
        // 글번호 0으로 초기화
        // 조회내역이 있는 경우
        //-조회된 내역이 있는 경우 새로운 리스트 생성
        //-글 번호를 1 로 변경
        // 조회내역이 없는 경우
        //-조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        boardList.add(b);
        System.out.println("등록 성공");
        // 출력값 결정(successPage)
    }

    /* 게시글 전체 조회용 메소드 */
    public void selectAllList() {
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        rp.printAllList(boardList);
    }

    /* 게시물 1개 조회용 메소드 */
    public void selectOneBoard(int boardNo) {
        // 전체 게시물을 조회
        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        // 조회성공 시 조회수 1증가
        // 일치하는 게시물이 없으면 에러출력,
        // 일치하는 내용이 있으면 게시물 출력
        boolean ishere = false;

        for(BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                System.out.print("조회성공");
                System.out.println(b.toString());
                b.setReadCount(b.getReadCount()+1);
                ishere = true;
            }
        }

        if(!ishere){
            System.out.println("게시글 없음");
        }
    }

    /* 게시물 제목 변경용 메소드 */
    public void updateBoardTitle(int boardNo, String title) {
        // 전체 리스트 조회 일치하는 게시물 조회 //  조회 결과가 있는 경우 제목 수정결과 출력(successPage)
        boolean ishere = false;

        for(BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                System.out.println(b.toString());
                b.setBoardTitle(title);
                ishere = true;
                System.out.println("제목 수정 성공");
            }
        }

        if(!ishere){
            System.out.println("게시글 없음");
        }
    }

    /* 게시물 내용 변경용 메소드 */
    public void updateBoardContent(int boardNo, String content) {
        boolean ishere = false;

        for(BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                System.out.println(b.toString());
                b.setBoardContent(content);
                ishere = true;
                System.out.println("게시물 내용 수정 성공");
            }
        }

        if(!ishere){
            System.out.println("게시글 없음");
        }
    }
    /* 게시물 삭제용 메소드 */
    public void deleteBoard(int boardNo) {
        boolean ishere = false;

        for(int i = 0; i<boardList.size(); i++){
            if(boardList.get(i).getBoardNo() == boardNo){
                System.out.println(boardList.get(i).toString());
                boardList.remove(i);
                System.out.println("삭제 완료");
            }
        }

        if(!ishere){
            System.out.println("게시글 없음");
        }
    }

    /* 제목으로 조회 */
    public void searchBoard(String title) {
        ArrayList<BoardDTO> resultList = new ArrayList<>();
        for(BoardDTO b : boardList){
            if(b.getBoardTitle().contains(title)){
                resultList.add(b);
            }
        }
        // 전체 게시물 조회
        // 검색 결과를 담을 리스트 생성
        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력

        if(resultList.size() >0){
            for(BoardDTO b: resultList){
                System.out.println(b.toString());
            }
        }
    }
    /* 정렬 처리용 메소드 */
    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회
        // 정렬
        // 출력
        for(BoardDTO b: boardList){
            System.out.println(b);
        }
    }

}
