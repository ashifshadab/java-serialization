package com.ashifshadab.serializationWithInheritance;

import java.io.Serial;
import java.io.Serializable;

public class Student extends School implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int studentId;

    private String studentName;

    public Student() {
    }

    public Student(int schoolId, String schoolName, int studentId, String studentName) {
        super(schoolId, schoolName);
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return super.toString()+" Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
