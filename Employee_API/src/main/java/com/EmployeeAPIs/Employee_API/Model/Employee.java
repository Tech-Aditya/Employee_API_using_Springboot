package com.EmployeeAPIs.Employee_API.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(name = "EmpName")
    private String EmpName;

    @Column(name = "emp_salary")
    private Float emp_salary;

    @Column(name = "emp_age")
    private int emp_age;

    @Column(name = "emp_city")
    private String emp_city;

    public Employee() {

    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Float getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(Float emp_salary) {
        this.emp_salary = emp_salary;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }

    public Employee(Long emp_id, String empName, Float emp_salary, int emp_age, String emp_city) {
        this.emp_id = emp_id;
        EmpName = empName;
        this.emp_salary = emp_salary;
        this.emp_age = emp_age;
        this.emp_city = emp_city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", EmpName='" + EmpName + '\'' +
                ", emp_salary=" + emp_salary +
                ", emp_age=" + emp_age +
                ", emp_city='" + emp_city + '\'' +
                '}';
    }
}
