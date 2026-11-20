package com.ohgiraffers.api.object.car;

// Car클래스를 이용한 App의 실행코드가 적절하게 실행할 수 있도록 메소드를 오버라이딩하기
public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        super(); // 작성해야하는데 안했음
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    //*** 이해X
    // 복사생성자
    public Car(Car other) {
        this.carName = other.carName;
        this.carColor = other.carColor;
        this.engineCC = other.engineCC;
    }

    // *** 이해X
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        // 같은 클래스타입이 아니면, false;
        if (getClass() != obj.getClass())
            return false;

        // Car 객체이므로, 각필드별 비교시작
        Car other = (Car) obj;
        // 1. carName필드
        if (carName == null) {
            if (other.carName != null)
                return false;
        } else if (!carName.equals(other.carName))
            return false;

        // 2. carColor필드
        if (carColor == null) {
            if (other.carColor != null)
                return false;
        } else if (!carColor.equals(other.carColor))
            return false;

        //여기까지 도달하면 true리턴
        return true;

    }

    // ***이해X
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carColor == null) ? 0 : carColor.hashCode());
        result = prime * result + ((carName == null) ? 0 : carName.hashCode());
        return result;
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

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engineCC=" + engineCC +
                '}';
    }
}
