package com.company;

public class Persona implements Precedeable<Persona>{
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    private boolean condicion (int n1, int n2){
        return n1 > n2;
    }

    @Override
    public <T> int precedeA(T t) {
        Persona p = (Persona) t;
        int valor;
        if (condicion(this.getDni(), p.getDni())){
            valor = -1;
        }
        else {
            valor = 1;
        }

        return valor;
    }
}
