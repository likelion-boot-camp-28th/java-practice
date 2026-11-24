package com.ohgiraffers.section01.ocp.basic.device.start;

import java.util.List;

public class Home {

    public void turnOffAll(List<Device> devices){
        int cnt =0;
        for(Device d:devices){
            d.turnOff();
            cnt++;
        }
        System.out.println("꺼진 가전 : "+cnt);
    }
}
