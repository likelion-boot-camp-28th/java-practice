package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp;

    public BoardManager() {
        boardList = new ArrayList<>();
        rp = new ResultPrinter();
    }

    public void insertBoard(BoardDTO b){
        int nextNo = boardList.isEmpty()
                ? 1
                : boardList.get(boardList.size() - 1).getBoardNo() + 1;

        b.setBoardNo(nextNo);
        boardList.add(b);
        rp.successPage("insertBoard");
    }

    public void selectAllList(){
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo){
        for(BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo){
                board.setReadCount(board.getReadCount() + 1);
                rp.printBoard(board);
                return;
            }
        }
        rp.errorPage("selectOne");

    }

    public void updateBoardTitle(int boardNo,String title){
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardTitle(title);
                rp.successPage("updateTitle");
                return;
            }
        }

        rp.errorPage("updateTitle");
    }

    public void updateBoardContent(int boardNo, String content){
        for (BoardDTO board : boardList) {
            if (board.getBoardNo() == boardNo) {
                board.setBoardContent(content);
                rp.successPage("updateContent");
                return;
            }
        }

        rp.errorPage("updateContent");
    }

    public void deleteBoard(int boardNo){
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) {
                boardList.remove(i);
                rp.successPage("deleteBoard");
                return;
            }
        }

        rp.errorPage("deleteBoard");
    }

    public void searchBoard(String title){
        ArrayList<BoardDTO> result = new ArrayList<>();

        for (BoardDTO board : boardList) {
            if (board.getBoardTitle().contains(title)) {
                result.add(board);
            }
        }

        if (result.isEmpty()) {
            rp.noSearchResult();
        } else {
            rp.printAllList(result);
        }
    }

    public void sortList(Comparator<BoardDTO> c){
        boardList.sort(c);
        rp.printAllList(boardList);
    }


}
