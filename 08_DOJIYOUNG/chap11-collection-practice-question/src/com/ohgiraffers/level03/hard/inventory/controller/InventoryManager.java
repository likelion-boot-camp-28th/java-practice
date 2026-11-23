package com.ohgiraffers.level03.hard.inventory.controller;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.lang.reflect.Array;
import java.util.*;

public class InventoryManager {
    private ArrayList<ItemDTO> arr = new ArrayList<>();

    public InventoryManager() {
    }

    public void addItem (ItemDTO itemDTO){
        arr.add(itemDTO);
    }

    public int removeSoldOut(){
        ArrayList<Integer> temp = new ArrayList<>();
        int cnt = 0;
        for(int i=0; i<arr.size();i++){
            if(arr.get(i).getQuantity() ==0){
                temp.add(i);
                cnt++;
            }
        }
        for(Integer i : temp){
            arr.remove(i);
        }

        return cnt;
    }

    public Map<String,Integer> sumByCategory(){
        HashMap<String, Integer> hm = new HashMap<>();
        for(ItemDTO i: arr){
            if(hm.containsKey(i.getCategory())){
                hm.put(i.getCategory(), hm.get(i.getCategory())+i.getQuantity());
            }else{
                hm.put(i.getCategory(),i.getQuantity());
            }
        }

        return hm;
    }

    //sortedBy(c:Comparator<ItemDTO>) : List<ItemDTO>
    // 전달받은 기준(Comparator)으로 정렬
    public List<ItemDTO> sortedBy(Comparator<ItemDTO> c){
        List<ItemDTO> copy = new ArrayList<>(arr);
        copy.sort(c);
        return copy;
    }

    //+ sortedByCode() : List<ItemDTO>
    public List<ItemDTO> sortedByCode(){
        List<ItemDTO> copy = new ArrayList<>(arr);
        Collections.sort(copy);
        return copy;
    }
}
