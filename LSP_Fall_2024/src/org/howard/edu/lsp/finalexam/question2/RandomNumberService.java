package org.howard.edu.lsp.finalexam.question2;


/**
 * Service that provides random number generation using the Strategy pattern.
 * This service is a Singleton.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberGenerator randomNumberGenerator;

    private RandomNumberService() {
        // Default to Java's implementation
        randomNumberGenerator = new RandomNumberGeneratorBuiltIn();
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     *
     * @return the singleton instance.
     */
    public static synchronized RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Set random number generator strategy.
     *
     * @param generator random number generator strategy to use.
     */
    public void setRandomNumberGenerator(RandomNumberGenerator generator) {
        this.randomNumberGenerator = generator;
    }

    /**
     * Generate random number using the current strategy.
     *
     * @return positive random integer.
     */
    public int generateRandomNumber() {
        return randomNumberGenerator.generateRandomNumber();
    }
}
