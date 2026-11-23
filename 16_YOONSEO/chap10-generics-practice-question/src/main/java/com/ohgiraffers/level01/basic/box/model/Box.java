package com.ohgiraffers.level01.basic.box.model;

public class Box <T> {
    private T item;

    // 받은 값을 필드에 담음, 반환&출력 X
    public void put (T item){
            this.item = item;
    }

    // 담은 값을 반환함, 반환형이 T이므로 상자를 만들때 정한 타입으로 바로 받음
    public T get(){
        return item;
    }

}
