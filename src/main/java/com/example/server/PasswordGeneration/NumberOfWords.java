package com.example.server.PasswordGeneration;

public class NumberOfWords {

    public String Number;

    public NumberOfWords(String number) {
        Number = number;
    }

    public NumberOfWords() {
        Number = "3";
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

}
