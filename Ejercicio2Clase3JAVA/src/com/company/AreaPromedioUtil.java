package com.company;

public class AreaPromedioUtil {
    public static double areaPromedio(FiguraGeometrica[] arr){
        double sumaAreas;

        sumaAreas = calcularPromedio(arr);

        return sumaAreas/arr.length;
    }

    private static double calcularPromedio(FiguraGeometrica[] arr){
        double sumaAreas = 0;
        for (FiguraGeometrica figuraGeometrica : arr){
            sumaAreas+=figuraGeometrica.area();
        }
        return sumaAreas;
    }
}