package org.example;


class Main {
    public static void main(String[] args) {
        Box current = new Box(20);
        Box another = current.copyDouble();
        current.showVolume();
        another.showVolume();

    }
}