package com.company;

public class PasswordDebil extends Password{
    private static String pwRegexDebil = "(?=.*[0-9])(?=.*[a-z]).{6,}";

    public PasswordDebil() {
        super(pwRegexDebil);
    }
}
