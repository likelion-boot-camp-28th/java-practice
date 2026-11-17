package com.ohgiraffers.level03.hard.repair.controller;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {
    private List<RepairDTO> repairs = new ArrayList<>();

    public void addRepair(String item){
        repairs.add(new RepairDTO(repairs.size() + 1,item));
    }

    public void advance(int id){
        for (RepairDTO r : repairs){
            if (r.getId() == id){
                r.advance();
            }
        }
    }

    public List<RepairDTO> getRepairs(){
        return repairs;
    }

    public  int countBy(RepairStatus status){
        int count = 0;
        for (RepairDTO r: repairs){
            if (r.getStatus() == status){
                count++;
            }
        }return count;
    }

    public int countByName(String statusName){
        return countBy(RepairStatus.valueOf(statusName));
    }


}
