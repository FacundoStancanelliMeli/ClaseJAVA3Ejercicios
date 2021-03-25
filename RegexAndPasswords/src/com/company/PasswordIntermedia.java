package com.company;

public class PasswordIntermedia extends Password{
    private static String pwRegexIntermedia = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}";

    public PasswordIntermedia() {
        super(pwRegexIntermedia);
    }
}