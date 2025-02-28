package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] array = new Product[5];
        array[0] = new Product("Лимон", "01.02.2025", "Сладость", "Россия",
                100, true);
        array[1] = new Product("Вишня", "15.02.2025", "Сладость", "Россия",
                350, false);
        array[2] = new Product("Хлеб", "11.02.2025", "Сладость", "Россия",
                60, true);
        array[3] = new Product("Слива", "21.02.2025", "Сладость", "Россия",
                120, true);
        array[4] = new Product("Орехи", "30.01.2025", "Сладость", "Россия",
                3000, true);
        for (int i = 0; i < array.length; i++) {
            array[i].info();
        }
    }
}