package com.company;

public class SortUtil {

    private static <T> void mostrarArray(Precedeable<T>[] arr){
        for (Precedeable<T> tPrecedeable : arr) {
            System.out.println(tPrecedeable);
        }
    }

    public static <T> void ordenar(Precedeable<T>[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                Precedeable<T> objeto1 = arr[j];
                Precedeable<T> objeto2 = arr[j + 1];

                if (objeto1.precedeA(objeto2) < 0) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = objeto1;
                }
            }
        }

        mostrarArray(arr);
    }


}
