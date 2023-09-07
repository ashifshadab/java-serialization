package com.ashifshadab.saveToDisk;

/**
 * If We are going to persist object of that class which doesn't implements
 * Serializable interface then it will throw java.io.NotSerializableException:
 */

public class Test {
    public static void main(String[] args){
        WriteObjectToFile writeObjectToFile = new WriteObjectToFile();
        writeObjectToFile.persist();

        ReadObjectFromFile readObjectFromFile = new ReadObjectFromFile();
        readObjectFromFile.readObject();
    }
}
