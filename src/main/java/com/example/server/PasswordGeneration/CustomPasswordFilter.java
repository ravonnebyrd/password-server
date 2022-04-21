package com.example.server.PasswordGeneration;

public class CustomPasswordFilter {

    public int length;
    public String symbols;
    public String uppercase;
    public String lowercase;
    public String numbers;

    public CustomPasswordFilter() {
    }

    public CustomPasswordFilter(int length) {
        this.length = length;
    }

    public CustomPasswordFilter(int length, String symbols) {
        this.length = length;
        this.symbols = symbols;
    }

    public CustomPasswordFilter(int length, String symbols, String uppercase) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
    }

    public CustomPasswordFilter(int length, String symbols, String uppercase, String lowercase) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
    }

    public CustomPasswordFilter(int length, String symbols, String uppercase, String lowercase, String numbers) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.numbers = numbers;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    public String getUppercase() {
        return uppercase;
    }

    public void setUppercase(String uppercase) {
        this.uppercase = uppercase;
    }

    public String getLowercase() {
        return lowercase;
    }

    public void setLowercase(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "CustomPasswordFilter{" +
                "length=" + length +
                ", symbols='" + symbols + '\'' +
                ", uppercase='" + uppercase + '\'' +
                ", lowercase='" + lowercase + '\'' +
                ", numbers='" + numbers + '\'' +
                '}';
    }
}
