package com.ohgiraffers.api.object;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;


    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    // 차 이름과 차 색이 같으면 같은 객
    @Override
    public boolean equals(Object o) {
        boolean result = false;

        if(this == o){
            result = true;
        }

        Car ocar =(Car) o;

        if(this.carName.equals(ocar.getCarName()) && this.carColor.equals(ocar.getCarColor())){
            result = true;
        }
        return result;
    }

    @Override
    public int hashCode() {
        int value = 1;
        value = carColor.hashCode()+carName.hashCode();
        return value;
    }
}