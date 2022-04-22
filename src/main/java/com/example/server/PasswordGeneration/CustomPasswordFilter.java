package com.example.server.PasswordGeneration;

public class CustomPasswordFilter {

    public String length;
    public Boolean symbols;
    public Boolean uppercase;
    public Boolean lowercase;
    public Boolean numbers;

    public CustomPasswordFilter() {
    }

    public CustomPasswordFilter(String length) {
        this.length = length;
    }

    public CustomPasswordFilter(String length, Boolean symbols) {
        this.length = length;
        this.symbols = symbols;
    }

    public CustomPasswordFilter(String length, Boolean symbols, Boolean uppercase) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
    }

    public CustomPasswordFilter(String length, Boolean symbols, Boolean uppercase, Boolean lowercase) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
    }

    public CustomPasswordFilter(String length, Boolean symbols, Boolean uppercase, Boolean lowercase, Boolean numbers) {
        this.length = length;
        this.symbols = symbols;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.numbers = numbers;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public Boolean getSymbols() {
        return symbols;
    }

    public void setSymbols(Boolean symbols) {
        this.symbols = symbols;
    }

    public Boolean getUppercase() {
        return uppercase;
    }

    public void setUppercase(Boolean uppercase) {
        this.uppercase = uppercase;
    }

    public Boolean getLowercase() {
        return lowercase;
    }

    public void setLowercase(Boolean lowercase) {
        this.lowercase = lowercase;
    }

    public Boolean getNumbers() {
        return numbers;
    }

    public void setNumbers(Boolean numbers) {
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
