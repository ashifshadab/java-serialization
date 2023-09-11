package com.ashifshadab.serializationWithAggregation;

import com.ashifshadab.serializationWithInheritance.Student;
import com.ashifshadab.utils.PathConstant;
import com.ashifshadab.utils.ReadObjectFromFile;
import com.ashifshadab.utils.WriteObjectToFile;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        //When both class implements Serializable Interface
        test.case1();
        //When Aggregated class doesn't implement Serializable Interface
        test.case2();
    }



    private  void case1() {
        System.out.println("Test Serializable Interface with HAS-A when both class implements Serializable Interface");
        new WriteObjectToFile().persist(getChair(), PathConstant.LOCAL_FILE_PATH+"Chair.ser");
        Chair chair = (Chair) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Chair.ser");
        System.out.println(chair);
    }

    private  void case2() {
        System.out.println("Test Serializable Interface with HAS-A and Department class doesn't implements Serializable Interface");
        new WriteObjectToFile().persist(getEmployee(), PathConstant.LOCAL_FILE_PATH+"Employee.ser");
        Employee employee = (Employee) new ReadObjectFromFile().getObjectFromDisk(PathConstant.LOCAL_FILE_PATH+"Employee.ser");
        System.out.println(employee);
    }
    private Chair getChair(){
        return new Chair(600,"Armchair",new Wood(100,"Teak"));
    }
    private Employee getEmployee(){
        return new Employee(1,"Ashif",new Department(300,"IT"));
    }
}
