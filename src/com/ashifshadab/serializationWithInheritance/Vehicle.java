package com.ashifshadab.serializationWithInheritance;

import java.io.Serial;
import java.io.Serializable;

public class Vehicle implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int vehicleId;
    private String vehicleModel;

    public Vehicle(){}
    public Vehicle(int vehicleId, String vehicleModel) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                '}';
    }
}
