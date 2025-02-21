package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkRange(10, 20));
        checkOdd(0);
        checkNegative(0);
        printStringCount("больше", 4);
        System.out.println(checkYear(365));
        changeArray();
        fillArray();
        multiplyOn2();
        fillDiagonal();
        fillValue(10, 20);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkRange(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkOdd(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.print("Отрицательное");
        }
    }

    public static void checkNegative(int a) {
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void printStringCount(String str, int number) {
        while (number > 0) {
            System.out.println(str);
            number--;
        }
    }

    public static boolean checkYear(int days) {
        if (days == 366) {
            return true;
        } else {
            return false;
        }
    }

    public static void changeArray() {
        int[] intArray = {0, 0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < intArray.length; i++) {
            int a = intArray[i];
            if (a == 0) {
                intArray[i] = 1;
            } else {
                intArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void fillArray() {
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray));
    }

    public static void multiplyOn2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length - 1; j < array[i].length; j++, x--) {
                if (i == j || i == x) array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void fillValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
}