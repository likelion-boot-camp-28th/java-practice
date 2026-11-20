package com.ohgiraffers.level03.hard.repair.model;

public enum RepairStatus {
    RECEIVED("접수"),
    FIXING("수리 중"),
    DONE("완료");

    private String label;

    RepairStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public RepairStatus next(){
        RepairStatus s = null;

        if(this == RECEIVED){s=FIXING;}
        if(this == FIXING){s=DONE;}
        if(this == DONE){s=DONE;}

        return s;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
