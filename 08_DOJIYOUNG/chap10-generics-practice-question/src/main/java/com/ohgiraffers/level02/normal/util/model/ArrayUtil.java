package com.ohgiraffers.level02.normal.util.model;

public class ArrayUtil<T> {

    public void swap(T[] arr, int i, int j){
        T vali = arr[i];
        T valj = arr[j];

        arr[i] = valj;
        arr[j] = vali;
    }

    public int count(T[] arr, T target){
        int cnt=0;
        for(T a:arr){
            if(a.equals(target)){cnt++;}
        }

        return cnt;
    }

    public T last(T[] arr){
        T d = arr[arr.length-1];
        return d;
    }
}
