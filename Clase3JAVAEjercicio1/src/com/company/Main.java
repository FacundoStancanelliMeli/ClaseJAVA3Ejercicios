package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona personaPrecedeable = new Persona("Juan", 444424);
        Persona personaPrecedeable2 = new Persona("Jose", 888812);
        Persona personaPrecedeable3 = new Persona("Julian", 666210);

        Celular celular = new Celular(14444, personaPrecedeable);
        Celular celular1 = new Celular(144412, personaPrecedeable2);
        Celular celular2 = new Celular(50000, personaPrecedeable3);

        Celular [] celulares = {celular, celular1, celular2};
        SortUtil.ordenar(celulares);

    }
}