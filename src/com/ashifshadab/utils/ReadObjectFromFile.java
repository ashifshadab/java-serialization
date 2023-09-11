package com.ashifshadab.utils;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
    public Object getObjectFromDisk(String fileName) {
        System.out.println("Reading Object Start");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return objectInputStream.readObject();
        } catch (Exception ex) {
            System.out.println("Reading Object Interrupted");
            ex.printStackTrace();
        }
        System.out.println("Reading Object Over");
        return null;
    }
}
