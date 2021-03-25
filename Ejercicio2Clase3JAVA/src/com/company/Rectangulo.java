package com.company;

public class Rectangulo extends FiguraGeometrica{
    private final double base;
    private final double altura;

    public Rectangulo(double b, double h) {
        this.base = b;
        this.altura = h;
    }

    @Override
    public double area() {
        return (this.altura*this.base);
    }
}