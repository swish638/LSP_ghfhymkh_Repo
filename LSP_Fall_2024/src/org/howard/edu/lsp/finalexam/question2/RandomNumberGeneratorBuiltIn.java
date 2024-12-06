package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implement of RandomNumberGenerator using Java's Random class.
 */
public class RandomNumberGeneratorBuiltIn implements RandomNumberGenerator {
    private final Random random = new Random();

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}
