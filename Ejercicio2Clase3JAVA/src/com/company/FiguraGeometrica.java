package com.company;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString() {
        return "Area figura " + area();
    }
}