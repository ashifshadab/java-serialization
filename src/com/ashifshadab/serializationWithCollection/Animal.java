package com.ashifshadab.serializationWithCollection;

public class Animal {
    private  String animalName;

    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
