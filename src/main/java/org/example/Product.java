package org.example;

public class Product {
    private final String name;
    private final String productionDate;
    private final String manufacturer;
    private final String countryOfOrigin;
    private final int price;
    private final boolean buyersReservationStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin,
                   int price, boolean buyersReservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.buyersReservationStatus = buyersReservationStatus;
    }

    public void info() {
        System.out.println("Название: " + name + "; Дата производства: " + productionDate +
                "; Производитель: " + manufacturer +"; Страна происхождения: " + countryOfOrigin +
                "; Цена: " + price + "; Состояние бронирования покупателем: " + buyersReservationStatus);
    }
}