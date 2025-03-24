package org.example;

import java.util.Scanner;

public class AreaTriangle {
    public static void calcAreaTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину треугольника: ");
        double base = scanner.nextDouble();
        System.out.println("Введите высоту треугольника: ");
        double height = scanner.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Площадь треугольника равна: " + area);
    }
}