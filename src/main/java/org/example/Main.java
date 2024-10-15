package org.example;


class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.width = 10;
//        box1.length = 10;
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.width = 20;
//        box2.length = 20;
//        double volume1 = box1.height * box1.width * box1.length;
//        System.out.println(volume1);
//        double volume2 = box2.height * box2.width * box2.length;
//        System.out.println(volume2);

        Person john = new Person();
        Person nick = new Person();
        Person max = new Person();
        john.name = "John";
        john.age = 17;
        john.weight = 70;
        nick.name = "Nick";
        nick.age = 18;
        nick.weight = 80;
        max.name = "Max";
        max.age = 19;
        max.weight = 90;
        int sum = john.age + nick.age + max.age;
        double avg = sum / 3.0;
        System.out.println(avg);
    }
}