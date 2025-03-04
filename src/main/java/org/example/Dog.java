package org.example;

public class Dog extends Animal {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }


    @Override
    public void run(int length) {
        length = Math.min(length, 500);
        super.run(length);
    }

    @Override
    public void swim(int length) {
        length = Math.min(length, 10);
        super.swim(length);
    }

    public static int getDogCount() {
        return dogCount;
    }

}