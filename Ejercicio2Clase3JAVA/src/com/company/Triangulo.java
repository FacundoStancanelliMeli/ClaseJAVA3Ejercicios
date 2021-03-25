package com.company;

public class Triangulo extends FiguraGeometrica{
    private final double base;
    private final double altura;

    public Triangulo(double b, double h) {
        this.base = b;
        this.altura = h;
    }

    @Override
    public double area() {
        return (this.altura*this.base)/2;
    }
}