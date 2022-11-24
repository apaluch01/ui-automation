package utils;

import java.util.Random;

public class RandomUtils {
    public String mail;

    public RandomUtils(String mail) {
        this.mail = generateRandomEmail(mail);
    }

    String generateRandomEmail(String domain){
        int ASCII_ZERO = 48;
        int ASCII_NINE = 57;
        int ASCII_A_CAPITAL = 65;
        int ASCII_Z_CAPITAL = 90;
        int ASCII_A = 97;
        int ASCII_Z = 122;
        int leftLimit = ASCII_ZERO;
        int rightLimit = ASCII_Z;
        int targetStringLength = 5;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= ASCII_NINE || i >= ASCII_A_CAPITAL) && (i <= ASCII_Z_CAPITAL || i >= ASCII_A))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString + "@" + domain);
    }
}
