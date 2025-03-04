package org.example;

public class Triangle implements Calculate {
    private String fillColor;
    private String bordenColor;
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public int calculateSquare() {
        double p = (double) (a + b + c) / 2;
        return (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
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