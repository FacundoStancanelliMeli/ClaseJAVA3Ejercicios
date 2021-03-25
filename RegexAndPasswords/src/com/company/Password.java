package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private final Pattern pattern;

    public Password(String passwordRegex) {
        this.pattern = Pattern.compile(passwordRegex);
    }

    public void setValue(String pwd){
        Matcher matcher = pattern.matcher(pwd);
        if (matcher.matches()){
            mensajeMatcheo();
        }
        else{
            mostrarExcepcion();
        }
    }

    private void mensajeMatcheo(){
        System.out.println("La contraseña es correcta");
    }

    private void mostrarExcepcion(){
        try {
            throw new Exception("La contraseña no esta entre los parametros de validación");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}