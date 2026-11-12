package com.ohgiraffers.level03.hard.inventory.controller;

import com.ohgiraffers.level03.hard.inventory.model.dto.ItemDTO;

import java.util.*;

public class InventoryManager {
    private List<ItemDTO> items = new ArrayList<>();

    public void addItem(ItemDTO item){
        items.add(item);
    }

    public int removeSoldOut(){
        int count = 0;
        Iterator<ItemDTO> it = items.iterator();
        while (it.hasNext()){
            ItemDTO item = it.next();
            if (item.getQuantity() == 0){
                it.remove();
                count++;
            }
        }
        return count;
    }

    public Map<String,Integer> sumByCategory(){
        Map<String,Integer> map = new TreeMap<>();
        for (ItemDTO item : items){
            if (map.containsKey(item.getCategory())){
                map.put(item.getCategory(), map.get(item.getCategory()) + item.getQuantity());
            }else {
                map.put(item.getCategory(),item.getQuantity());
            }
        }
        return map;
    }

    public List<ItemDTO> sortedBy(Comparator<ItemDTO> c){
        List<ItemDTO> copy = new ArrayList<>(items);
        Collections.sort(copy, c);
        return copy;
    }

    public List<ItemDTO> sortedByCode(){
        List<ItemDTO> copy = new ArrayList<>(items);
        Collections.sort(copy);
        return copy;
    }
}
