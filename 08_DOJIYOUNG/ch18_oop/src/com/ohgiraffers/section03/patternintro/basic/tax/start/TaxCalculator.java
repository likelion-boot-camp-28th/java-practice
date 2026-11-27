package com.ohgiraffers.section03.patternintro.basic.tax.start;

public class TaxCalculator {
    public int withTax(int price){
        int total = price+price/10;
        return total / 100 * 100;
    }
}
