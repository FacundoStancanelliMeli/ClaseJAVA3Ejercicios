package com.company;

public class Circulo extends FiguraGeometrica{
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio;
    }
}