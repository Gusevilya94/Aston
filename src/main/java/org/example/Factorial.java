package org.example;

import java.util.Scanner;

public class Factorial {
    public static void calc() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = input.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Факториал числа " + num + " равен " + fact);
    }
}
