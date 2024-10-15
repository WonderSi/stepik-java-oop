package org.example.examples;

public class Employee {
    String name;
    String position;
    int salary;

    Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Name: " + name + "\nPosition: " + position + "\nSalary: " + salary);
    }
}
