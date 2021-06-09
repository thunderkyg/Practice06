package com.javaex.ex05;

public class Employee {

	//Fields
    private String name;
    private int salary;

    //Constructor
    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    //Method - G/S

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    //Method - Ordinary

    public void showInformation() {
        System.out.println("이름:" + name + "연봉:" + salary);
    }

}


