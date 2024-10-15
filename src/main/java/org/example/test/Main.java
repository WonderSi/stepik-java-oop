package org.example.test;


import org.example.examples.Person;

class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.setAge(40);
        System.out.println("Name: " + person.getName() + "\nAge: " + person.getAge());
    }
}