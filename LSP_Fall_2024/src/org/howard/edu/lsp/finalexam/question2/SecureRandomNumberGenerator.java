package org.howard.edu.lsp.finalexam.question2;

import java.security.SecureRandom;

/**
 * Implementation of RandomNumberGenerator using SecureRandom.
 */
public class SecureRandomNumberGenerator implements RandomNumberGenerator {
    private final SecureRandom secureRandom = new SecureRandom();

    @Override
    public int generateRandomNumber() {
        return secureRandom.nextInt(Integer.MAX_VALUE) + 1;
    }
}
