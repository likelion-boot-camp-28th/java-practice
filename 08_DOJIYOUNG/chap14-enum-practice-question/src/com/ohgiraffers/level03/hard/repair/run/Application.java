package com.ohgiraffers.level03.hard.repair.run;

import com.ohgiraffers.level03.hard.repair.controller.RepairManager;
import com.ohgiraffers.level03.hard.repair.model.RepairStatus;
import com.ohgiraffers.level03.hard.repair.model.dto.RepairDTO;

public class Application {
    public static void main(String[] args) {
        /**
         * 노트북, 프린터, 모니터, 키보드를 차례로 접수한다.
         * 1번은 두 번, 2번은 한 번, 3번은 세 번 진행한 뒤 모든 접수를 출력한다.
         * 머리 줄 == 상태별 건수 == 아래에 <상태 이름> : <N>건을 선언 순서대로 출력한다.
         * 머리 줄 == 이름으로 찾기 == 아래에 DONE과 CANCEL을 차례로 찾아
         * <찾는 이름> : <N>건을 출력하고,
         * 없는 이름은 예외를 잡아 <찾는 이름> : 없는 상태를 출력한다.
         * */

        RepairManager rm = new RepairManager();

        // 1. 수리 4건을 RepairManager에 넣는다
        rm.addRepair("노트북");
        rm.addRepair("프린터");
        rm.addRepair("모니터");
        rm.addRepair("키보드");
        System.out.println("=========1=========");
        for(RepairDTO r: rm.getRepairs()){
            System.out.println(r.toString());
        }

        // 2. 1번은 두 번, 2번은 한 번, 3번은 세 번 진행한다
        rm.advance(1); rm.advance(1);
        rm.advance(2);
        rm.advance(3); rm.advance(3);rm.advance(3);

        // 3. 모든 접수를 출력한다
        System.out.println("=========3=========");
        for(RepairDTO r: rm.getRepairs()){
            System.out.println(r.toString());
        }

        // 4. 상태별 건수를 enum 선언 순서대로 출력한다
        System.out.println("=========4=========");
        for(RepairStatus s:RepairStatus.values()){
            System.out.print(s.getLabel());
            System.out.print(" : ");
            System.out.println(rm.countBy(s));
        }

        // 5. 상태 이름 DONE과 CANCEL로 건수를 찾아 출력한다
        System.out.println("=========5=========");
        try{
            System.out.println("DONE : "+ rm.countByName("DONE"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("CANCEL : "+ rm.countByName("CANCEL"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




    }
}
