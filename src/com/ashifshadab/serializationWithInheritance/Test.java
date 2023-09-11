package com.ashifshadab.serializationWithInheritance;

import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        //When Both Class Implement Serializable Interface
        test.case1();
        //When Only Parent Class Implement Serializable Interface
        test.case2();
        //When Child Class only Implement Serializable Interface
        test.case3();
        //When Child Class only Implement Serializable Interface, but we need to Serialize Parent class also
        test.case4();

    }

    private void case1() {
        System.out.println("When Both Class Implement Serializable Interface");
        new WriteObjectToFile().persist(getStudent(), PathConstant.LOCAL_FILE_PATH+"Student.ser");
        Student student = (Student) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Student.ser");
        System.out.println(student);
    }
    private void case2() {
        System.out.println("When Parent Class Implement Serializable Interface and Child class doesn't");
        new WriteObjectToFile().persist(getCar(), PathConstant.LOCAL_FILE_PATH+"Car.ser");
        Car car = (Car) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Car.ser");
        System.out.println(car);
    }

    private void case3() {
        System.out.println("When Child Class only Implement Serializable Interface");
        new WriteObjectToFile().persist(getActor(), PathConstant.LOCAL_FILE_PATH+"Actor.ser");
        Actor actor = (Actor) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Actor.ser");
        System.out.println(actor);
    }

    private void case4() {
        System.out.println("When Child Class only Implement Serializable Interface");
        new WriteObjectToFile().persist(getProduct(), PathConstant.LOCAL_FILE_PATH+"Product.ser");
        Product product = (Product) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Product.ser");
        System.out.println(product);
    }

    private Actor getActor() {
        return new Actor(1000,"Titanic",509,"Leonardo");
    }


    private Student getStudent(){
        return new Student(1,"E.G High School",100,"Ashif");
    }

    private Car getCar(){
        return new Car(900,"ZXC",50,"ALTO");
    }

    private Product getProduct(){
        return new Product(50,"Intel Inc",201,"Intel Chip");
    }
}
