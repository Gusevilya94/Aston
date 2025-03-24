package org.example;

import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите действие (+,-,*,/): ");
        char oper = scanner.next().charAt(0);
        int result = 0;
        switch (oper) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println("Результат операции: " + result);
    }
}