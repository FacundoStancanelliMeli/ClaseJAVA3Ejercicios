package com.company;

public class PasswordFuerte extends Password{
    private static String pwRegexFuerte = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public PasswordFuerte() {
        super(pwRegexFuerte);
    }
}