package org.example.company;

public class Employee {
    public String name;
    private double salary;
    protected String department;
    String position;

    public Employee() {

    }

    public Employee(String name, double salary, String department, String position) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    public void showAll(){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
        System.out.println(position);
    }
}
