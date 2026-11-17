package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

public class Application {
    public static void main(String[] args) {
        RepairManager rm = new RepairManager();
        rm.addRepair("노트북");
        rm.addRepair("프린터");
        rm.addRepair("모니터");
        rm.addRepair("키보드");
        rm.advance(1);
        rm.advance(1);
        rm.advance(2);
        rm.advance(3);
        rm.advance(3);
        rm.advance(3);
        for (RepairDTO r : rm.getRepairs()){
            System.out.println(r);
        }

        System.out.println("== 상태별 건수 ==");
        for (RepairStatus s : RepairStatus.values()){
            System.out.println(s.getLabel() + " : " + rm.countBy(s) + "건");
        }

        System.out.println("== 이름으로 찾기 ==");
        String[] names = {"DONE", "CANCEL"};
        for (String name : names){
            try {
                System.out.println(name + " : " + rm.countByName(name) + "건");
            }catch (IllegalArgumentException e){
                System.out.println(name + " : 없는 상태");
            }
        }
    }
}
