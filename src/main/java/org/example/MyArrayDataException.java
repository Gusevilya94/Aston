package org.example;

public class MyArrayDataException extends Exception {
    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        super();
        this.i = i;
        this.j = j;
    }
}