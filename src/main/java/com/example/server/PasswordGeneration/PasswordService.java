package com.example.server.PasswordGeneration;

import org.springframework.stereotype.Service;

import java.util.function.Supplier;


@Service
public class PasswordService {

    // ***** Helper Functions *****
    /*
        Purpose: To generate a unique length integer, between 8 - 30 inclusive.

        Citation: https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
        Accessed: 4-20-2022
    */

    int MIN_ASCII = 33;
    int MAX_ASCII = 126;

    public int randomIntegerBetween8and30(){

        int min = 8;
        int max = 30;

        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126 -
        All.

        Citation: https://beginnersbook.com/2015/05/java-ascii-to-string-conversion/
        Accessed: 4-20-2022
    */
    public String randomASCIIBetween33and126(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No lowercase.
    */
    public String randomASCIINoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( decimalCode >= 97 && decimalCode <= 122){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No uppercase.
    */
    public String randomASCIINoUppercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( decimalCode >= 65 && decimalCode <= 90){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No uppercase or lowercase.
    */
    public String randomASCIINoUppercaseNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( (decimalCode >= 65 && decimalCode <= 90) || ( decimalCode >= 97 && decimalCode <= 122)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No numbers.
    */
    public String randomASCIINoNumbers(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while (decimalCode >= 48 && decimalCode <= 57){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No numbers or lowercase.
    */
    public String randomASCIINoNumbersNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 97 && decimalCode <= 122)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No numbers or uppercase.
    */
    public String randomASCIINoNumbersNoUppercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 65 && decimalCode <= 90)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No numbers or uppercase or lowercase.
    */
    public String randomASCIINoNumbersNoUppercaseNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 65 && decimalCode <= 90)
        ||  ( decimalCode >= 97 && decimalCode <= 122)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No symbols.
    */
    public String randomASCIINoSymbols(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while (!((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 65 && decimalCode <= 90)
                ||  ( decimalCode >= 97 && decimalCode <= 122))){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No symbols or lowercase.
    */
    public String randomASCIINoSymbolsNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while (!((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 65 && decimalCode <= 90))){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No symbols no uppercase.
    */
    public String randomASCIINoSymbolsNoUppercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while (!((decimalCode >= 48 && decimalCode <= 57) || ( decimalCode >= 97 && decimalCode <= 122))){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No uppercase no symbols no lowercase.
    */
    public String randomASCIINoSymbolsNoUppercaseNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( !(decimalCode >= 48 && decimalCode <= 57) ){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
      Purpose: To generate a random ASCII character, between decimal code 33 - 126
      No symbols no numbers.
    */
    public String randomASCIINoSymbolsNoNumbers(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while (!(( decimalCode >= 65 && decimalCode <= 90) ||  ( decimalCode >= 97 && decimalCode <= 122))){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No symbols no numbers no lowercase.
    */
    public String randomASCIINoSymbolsNoNumbersNoLowercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( !(decimalCode >= 65 && decimalCode <= 90)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    /*
        Purpose: To generate a random ASCII character, between decimal code 33 - 126
        No symbols no numbers no uppercase.
    */
    public String randomASCIINoSymbolsNoNumbersNoUppercase(){

        int decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);

        while ( !(decimalCode >= 97 && decimalCode <= 122)){
            decimalCode = (int) Math.floor(Math.random() * (MAX_ASCII - MIN_ASCII + 1) + MIN_ASCII);
        }

        return Character.toString((char) decimalCode);
    }

    // ***** Main Functions *****

    /*
        Purpose: To create a unique, auto-generated password.

        Citation: https://stackoverflow.com/questions/242438/is-it-better-to-reuse-a-stringbuilder-in-a-loop
        Accessed: 4-20-2022
    */
    public Password makeRandomPassword(){

        // password length
        int length = randomIntegerBetween8and30();

        // str to return
        StringBuilder str = new StringBuilder();

        // loop to generate string characters
        for (int i = 0; i < length; i++){
            str.append(randomASCIIBetween33and126());
        }

        return new Password(str.toString());

    }

    /*
        Purpose: To create a customized password adhering to the presence of the following parameters.

        Citation: https://stackoverflow.com/questions/54303371/can-you-set-a-method-to-a-variable
        Accessed: 4-21-2022
    */
    public Password customizedPassword(CustomPasswordFilter cPW) {

        int passwordLength = (cPW.length != 0) ? cPW.length : randomIntegerBetween8and30();

        // str to return
        StringBuilder str = new StringBuilder();

        // mask the function we will use
        Supplier<String> passwordFunction = null;

        // 4 options, 16 combinations
        if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // All set
            passwordFunction = this::randomASCIIBetween33and126;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // lowercase is null
            passwordFunction = this::randomASCIINoLowercase;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // uppercase is null
            passwordFunction = this::randomASCIINoUppercase;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            passwordFunction = this::randomASCIINoUppercaseNoLowercase;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // numbers is null
            passwordFunction = this::randomASCIINoNumbers;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // numbers and lowercase is null
            passwordFunction = this::randomASCIINoNumbersNoLowercase;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // numbers and uppercase is null
            passwordFunction = this::randomASCIINoNumbersNoUppercase;

        } else if ((!cPW.symbols.isEmpty() && !cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // numbers, uppercase, and lowercase null
            passwordFunction = this::randomASCIINoNumbersNoUppercaseNoLowercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // symbols null
            passwordFunction = this::randomASCIINoSymbols;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // symbols and lowercase null
            passwordFunction = this::randomASCIINoSymbolsNoLowercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // symbols and uppercase null
            passwordFunction = this::randomASCIINoSymbolsNoUppercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (!cPW.numbers.isEmpty() && !cPW.numbers.isBlank())){

            // symbols uppercase and lowercase null
            passwordFunction = this::randomASCIINoSymbolsNoUppercaseNoLowercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // symbols and numbers null
            passwordFunction = this::randomASCIINoSymbolsNoNumbers;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (!cPW.uppercase.isEmpty() && !cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // symbols lowercase and numbers null
            passwordFunction = this::randomASCIINoSymbolsNoNumbersNoLowercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (!cPW.lowercase.isEmpty() && !cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // symbols numbers uppercase null
            passwordFunction = this::randomASCIINoSymbolsNoNumbersNoUppercase;

        } else if ((cPW.symbols.isEmpty() || cPW.symbols.isBlank()) && (cPW.uppercase.isEmpty() || cPW.uppercase.isBlank())
                && (cPW.lowercase.isEmpty() || cPW.lowercase.isBlank()) && (cPW.numbers.isEmpty() || cPW.numbers.isBlank())){

            // All null
            return new Password("");

        }

        // loop to generate string characters
        // loop to generate string characters
        for (int i = 0; i < passwordLength; i++){
            str.append(passwordFunction.get());
        }

        return new Password(str.toString());
    }
}
