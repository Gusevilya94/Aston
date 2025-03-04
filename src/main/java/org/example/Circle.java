package org.example;

public class Circle implements Calculate {
    private String fillColor;
    private String bordenColor;
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int calculateSquare() {
        return (int) (2 * Math.PI * (radius * radius));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override

    public String getBordenColor() {
        return bordenColor;
    }

    @Override
    public void setBordenColor(String bordenColor) {
        this.bordenColor = bordenColor;
    }
}