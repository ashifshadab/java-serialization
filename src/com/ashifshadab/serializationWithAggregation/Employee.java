package com.ashifshadab.serializationWithAggregation;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int employeeId;
    private String employeeName;

    private Department department;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department=" + department +
                '}';
    }
}
