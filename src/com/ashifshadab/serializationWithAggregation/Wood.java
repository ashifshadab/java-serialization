package com.ashifshadab.serializationWithAggregation;

import java.io.Serial;
import java.io.Serializable;

public class Wood implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int woodId;
    private String woodName;

    public Wood() {
    }

    public Wood(int woodId, String woodName) {
        this.woodId = woodId;
        this.woodName = woodName;
    }

    public int getWoodId() {
        return woodId;
    }

    public void setWoodId(int woodId) {
        this.woodId = woodId;
    }

    public String getWoodName() {
        return woodName;
    }

    public void setWoodName(String woodName) {
        this.woodName = woodName;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "woodId=" + woodId +
                ", woodName='" + woodName + '\'' +
                '}';
    }
}
