package com.ohgiraffers.level03.hard.repair.controller;

import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

import java.util.ArrayList;

public class RepairManager {

    private ArrayList<RepairDTO> repairs = new ArrayList<>();
    private static int id =0;

    public void addRepair(String item){
        repairs.add(new RepairDTO(++id, item));
    }

    public void advance(int id){
        for(RepairDTO r: repairs){
            if(r.getId() == id){
                r.advance();
            }
        }
    }

    public ArrayList<RepairDTO> getRepairs(){
        return repairs;
    }

    public int countBy(RepairStatus status){
        int cnt =0;
        for(RepairDTO r:repairs){
            if(r.getStatus() == status){
                cnt++;
            }
        }
        return cnt;
    }

    public int countByName(String statusName) throws Exception{
       int cnt = 0;
       for(RepairDTO r:repairs){
           if(r.getStatus().toString().equals(statusName)){
               cnt++;
           }
       }

       int confirm = 0;
       for(RepairStatus s:RepairStatus.values()){
           if(s.toString().equals(statusName)){
               confirm=1;
           }
        }

       if(confirm==0){
           throw new Exception("없는 상태");
       }
       return cnt;
    }



}
