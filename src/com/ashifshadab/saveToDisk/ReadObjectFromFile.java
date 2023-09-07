package com.ashifshadab.saveToDisk;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {

    private static final String LOCAL_FILE_PATH = "/home/ashif/PERSONAL/Repository/Github/ashifshadab/java-serialization/out/data/data.ser";

    private Object getObjectFromDisk() {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(LOCAL_FILE_PATH))) {
            return objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void readObject(){
        System.out.println("Address Object Reading start");
        Address address = (Address) getObjectFromDisk();
        System.out.println(address);
        System.out.println("Address Object Reading End");

        /* data.ser file does not contain Game object so through Exception
        System.out.println("Game Object Reading start");
        Game game =(Game) getObjectFromDisk();
        System.out.println(game);
        System.out.println("Game Object Reading End");
        */

    }
}
