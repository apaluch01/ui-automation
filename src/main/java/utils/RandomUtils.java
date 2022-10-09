package utils;

import java.util.Random;

public class RandomUtils {
    public String mail;

    public RandomUtils(String mail) {
        this.mail = generateRandomEmail(mail);
    }

    String generateRandomEmail(String domain){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 5;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return (generatedString + "@" + domain);
    }
}
