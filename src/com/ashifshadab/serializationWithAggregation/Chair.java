package com.ashifshadab.serializationWithAggregation;

import java.io.Serial;
import java.io.Serializable;

public class Chair implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int chairId;
    private String chairType;

    private Wood wood;

    public Chair() {
    }

    public Chair(int chairId, String chairType, Wood wood) {
        this.chairId = chairId;
        this.chairType = chairType;
        this.wood = wood;
    }

    public int getChairId() {
        return chairId;
    }

    public void setChairId(int chairId) {
        this.chairId = chairId;
    }

    public String getChairType() {
        return chairType;
    }

    public void setChairType(String chairType) {
        this.chairType = chairType;
    }

    public Wood getWood() {
        return wood;
    }

    public void setWood(Wood wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "chairId=" + chairId +
                ", chairType='" + chairType + '\'' +
                ", wood=" + wood +
                '}';
    }
}
