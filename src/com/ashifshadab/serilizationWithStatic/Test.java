package com.ashifshadab.serilizationWithStatic;

import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.write();
        test.read();
    }

    private void read() {
        ReadObjectFromFile readObjectFromFile = new ReadObjectFromFile();
        Person person = (Person) readObjectFromFile.getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Person.ser");
        System.out.println(person);
    }

    private void write() {
        Person person = init();
        WriteObjectToFile writeObjectToFile = new WriteObjectToFile();
        writeObjectToFile.persist(person,PathConstant.LOCAL_FILE_PATH+"Person.ser");
    }

    private Person init() {
        Person person = new Person();
        person.setFirstName("MD");
        person.setMiddleName("Ashif");
        person.setLastName("Shadab");
        person.setPetName("Boss");
        return person;
    }
}
