package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "l", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                System.out.println(stringArrayToInt(arr));
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
        try {
            for (int i = 0; i <= arr.length; i++) {
                String[] stringArr = arr[i];
                System.out.println(Arrays.toString(stringArr));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }

    public static int stringArrayToInt(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array.length; j++) {
                try {
                    int k = Integer.parseInt(array[i][j]);
                    sum += k;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}