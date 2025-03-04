package org.example;

public class Main {
    public static void main(String[] args) {
        FoodBowl foodBowl = new FoodBowl(10);
        Cat[] catsArray = {
                new Cat("Барсик"),
                new Cat("Вася"),
                new Cat("Фарис"),
                new Cat("Мяшка"),
                new Cat("Лор")
        };
        for (Cat value : catsArray) {
            value.eat(foodBowl, 3);
            if (value.isSatiety) {
                System.out.println(value.name + " сыт.");
            } else {
                System.out.println(value.name + " голоден.");
            }
        }
        Calculate[] figures = {
                new Circle(2),
                new Rectangle(7, 4),
                new Triangle(8, 5, 4)
        };
        for (Calculate value : figures) {
            value.setFillColor("Красный");
            value.setBordenColor("Чёрный");
            System.out.println("Периметр = " + value.calculatePerimeter() + ", площадь = " + value.calculateSquare() + ", цвет фона = " + value.getFillColor() + ", цвет границ = " + value.getBordenColor());

        }
    }
}