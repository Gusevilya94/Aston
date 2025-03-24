package org.example;

import java.util.Scanner;

public class Comparison {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " больше чем " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " больше чем " + num1);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }
    }
}