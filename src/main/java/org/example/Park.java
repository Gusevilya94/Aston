package org.example;

public class Park {
    public static class Attraction {
        private final String name;
        private final String time;
        private final double cost;

        public Attraction(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
    }
}