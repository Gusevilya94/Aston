package org.example;

public class Rectangle implements Calculate {
    private String fillColor;
    private String bordenColor;
    private final int height;
    private final int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return (height + width) * 2;
    }

    @Override
    public int calculateSquare() {
        return height * width;
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