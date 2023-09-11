package com.ashifshadab.utils;

import java.io.*;

public class WriteObjectToFile {
    public void persist(Object object,String fileName){
        try {
            System.out.println("Writing Object Start");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));

            objectOutputStream.writeObject(object);

            objectOutputStream.close();

            System.out.println("Writing Object Over");
        } catch (NotSerializableException | FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
