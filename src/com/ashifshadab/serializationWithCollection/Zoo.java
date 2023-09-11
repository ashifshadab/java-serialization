package com.ashifshadab.serializationWithCollection;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public class Zoo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String zooName;

    private List<Animal> animalList;

    public Zoo() {
    }

    public Zoo(String zooName, List<Animal> animalList) {
        this.zooName = zooName;
        this.animalList = animalList;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooName='" + zooName + '\'' +
                ", animalList=" + animalList +
                '}';
    }
}
