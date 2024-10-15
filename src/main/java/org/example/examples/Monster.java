package org.example.examples;

public class Monster {
    int countEyes;
    int countHand;
    int countLegs;

    Monster() {
        this(2);
    }

    Monster(int countEyes, int countHand, int countLegs) {
        this.countEyes = countEyes;
        this.countHand = countHand;
        this.countLegs = countLegs;
    }

    Monster(int count) {
        this(count, count, count);
    }

    void voice () {
        voice(1);
    }

    void voice (int count) {
        voice(count, "Grrrrrrrrrrrrrrrr...");
    }

    void voice (int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }
}
