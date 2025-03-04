package org.example;

public class Cat extends Animal {

    private static int catCount = 0;
    public boolean isSatiety;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int length) {
        length = Math.min(length, 200);
        super.run(length);
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(FoodBowl foodBowl, int footAmount) {
        isSatiety = foodBowl.decreaseFood(footAmount);
    }
}