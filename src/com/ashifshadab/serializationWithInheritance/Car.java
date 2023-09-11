package com.ashifshadab.serializationWithInheritance;

public class Car extends Vehicle{
    private int carId;
    private String carName;

    public Car() {

    }
    public Car(int vehicleId, String vehicleModel, int carId, String carName) {
        super(vehicleId, vehicleModel);
        this.carId = carId;
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return super.toString()+"Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                '}';
    }
}
