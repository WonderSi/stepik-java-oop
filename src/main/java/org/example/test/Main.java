package org.example.test;


import org.example.examples.MyMath;
import org.example.examples.Person;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        ArrayList<String> names = getEmployees();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i)+1 + " - " + names.get(i);
            result.add(s);
        }
        for (String s : result) {
            System.out.println(s);
        }

    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
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