package com.ashifshadab.serializationWithCollection;

import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.case1();
        // When Collection containing Object doesn't implement Serializable interface and try to serialize then it will throw NotSerializableException
        test.case2();
    }


    private void case1() {
        System.out.println("Test Serializable Interface with Collection case:1");
        new WriteObjectToFile().persist(getBookLibrary(), PathConstant.LOCAL_FILE_PATH + "BookLibrary.ser");
        BookLibrary bookLibrary = (BookLibrary) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH + "BookLibrary.ser");
        System.out.println(bookLibrary);
    }

    private void case2() {
        System.out.println("Test Serializable Interface with Collection case:2");
        new WriteObjectToFile().persist(getZoo(), PathConstant.LOCAL_FILE_PATH + "Zoo.ser");
        Zoo zoo = (Zoo) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH + "Zoo.ser");
        System.out.println(zoo);
    }


    private BookLibrary getBookLibrary() {
        return new BookLibrary(getList(), getSet(), getMap());
    }

    private List<String> getList() {
        List<String> list = new ArrayList<String>();
        list.add("My First Day in the World");
        list.add("Half Day");
        list.add("Games");
        return list;
    }

    private Set<String> getSet() {
        Set<String> set = new HashSet<String>();
        set.add("99 Days");
        set.add("100 Days");
        set.add("250 Days");
        return set;
    }

    private Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("ROW1", "Comedy Books");
        map.put("ROW2", "History Books");
        return map;
    }

    private Zoo getZoo() {
        return new Zoo("National Park", getAnimalList());
    }

    private List<Animal> getAnimalList() {
        List<Animal> animalList = new ArrayList<Animal>();
        animalList.add(new Animal("Tiger"));
        animalList.add(new Animal("Elephant"));
        return animalList;
    }
}
