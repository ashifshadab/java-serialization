package com.ashifshadab.serializationWithInheritance;

public class Factory {
    private int factoryId;
    private String factoryName;

    public Factory() {
    }

    public Factory(int factoryId, String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(int factoryId) {
        this.factoryId = factoryId;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryId=" + factoryId +
                ", factoryName='" + factoryName + '\'' +
                '}';
    }
}
