package com.example.server.PasswordGeneration;

import org.springframework.stereotype.Service;


@Service
public class PasswordService {

    /*
        Purpose: To generate a unique length integer, between 8 - 20 inclusive.

        Citation: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
        Accessed: 4-20-2022
    */
    public int randomIntegerBetween8and20(){

        int min = 8;
        int max = 20;

        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    /*
    Purpose: To generate a random ASCII character, between decimal code 33 - 126.

    Citation: https://beginnersbook.com/2015/05/java-ascii-to-string-conversion/
    Accessed: 4-20-2022
    */
    public String randomASCIIBetween33and126(){

        int min = 33;
        int max = 126;

        int decimalCode = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To create a unique, auto-generated password.

        Citation: https://stackoverflow.com/questions/242438/is-it-better-to-reuse-a-stringbuilder-in-a-loop
        Accessed: 4-20-2022
    */
    public String makeRandomPassword(){

        // password length
        int length = randomIntegerBetween8and20();

        // result to return
        StringBuilder result = new StringBuilder();

        // loop to generate string characters
        for (int i = 0; i < length; i++){
            result.append(randomASCIIBetween33and126());
        }

        return result.toString();

    }

}
