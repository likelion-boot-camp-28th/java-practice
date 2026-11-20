package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardNo implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        return Integer.compare(o1.getBoardNo(), o2.getBoardNo());
    }
}
