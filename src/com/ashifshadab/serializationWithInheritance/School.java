package com.ashifshadab.serializationWithInheritance;

import java.io.Serial;
import java.io.Serializable;

public class School implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int schoolId;
    private String schoolName;

    public School() {
    }

    public School(int schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
