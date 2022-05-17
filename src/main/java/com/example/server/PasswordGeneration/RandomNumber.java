package com.example.server.PasswordGeneration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomNumber {

    public int Number;

    public RandomNumber(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
