package org.example;

public class Animal {
    String name;
    private static int animalCount = 0;

    public Animal(String name) {

        this.name = name;
        animalCount++;
    }

    public void run(int length) {
        System.out.println(name + "пробежал " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(name + "проплыл " + length + " м.");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}