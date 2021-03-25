package com.company;

public class Celular implements Precedeable<Celular>{
    private int numero;
    private Persona titular;

    public Celular(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    private boolean condicion (int n1, int n2){
        return n1 > n2;
    }

    @Override
    public <T> int precedeA(T t) {
        Celular p = (Celular) t;
        int valor;

        if (condicion(this.getNumero(), p.getNumero())){
            valor = -1;
        }
        else {
            valor = 1;
        }

        return valor;
    }
}
