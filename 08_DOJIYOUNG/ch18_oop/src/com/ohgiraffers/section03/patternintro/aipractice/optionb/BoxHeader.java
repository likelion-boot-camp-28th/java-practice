package com.ohgiraffers.section03.patternintro.aipractice.optionb;

public class BoxHeader implements HeaderFormat {

    @Override
    public String header(String title) {
        return "[ " + title + " ]";
    }
}