package com.ohgiraffers.section04.singleton.basic.scoreboard.start;

public enum ScoreBoard
{
    //- 상수 `INSTANCE;` 하나를 쓰고, 그 아래에 `OldScoreBoard`와 같은 필드 `total`과 메소드 `add`·`getTotal`을 옮겨 적는다.
    //- 상수 뒤에 필드나 메소드를 더 쓰려면 상수 끝에 `;`를 붙인다.
    //    - enum은 어디서도 `new`로 객체를 만들 수 없다.
    INSTANCE;
    private int total;
    public void add(int point){total = total+point;}
    public int getTotal(){return total;}

}
