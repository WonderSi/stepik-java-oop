package org.example.test;


import org.example.examples.MyMath;
import org.example.examples.Person;

class Main {
    public static void main(String[] args) {
        MyArrayList employees = getEmployees();
        employees.add("James");
        employees.remove("John5");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John1");
        employees.add("John2");
        employees.add("John3");
        employees.add("John4");
        employees.add("John5");
        employees.add("John6");
        employees.add("John7");
        return employees;
    }
}