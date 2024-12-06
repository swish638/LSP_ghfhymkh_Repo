package org.howard.edu.lsp.finalexam.question2;


/**
 * A driver program to test the RandomNumberService and its implementations.
 * 
 * tests the following random number generator implementations:
 * - JavaRandomNumberGenerator, (Uses Java's built-in Random class)
 * - SecureRandomNumberGenerator, (Uses the SecureRandom class for cryptographically secure random numbers)
 * 
 * driver ensures each generator produces random numbers without errors.
 */
public class RandomNumberServiceDriver {

    /**
     * main method to execute the driver program.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        RandomNumberService randomNumberService = RandomNumberService.getInstance();

        // Test JavaRandomNumberGenerator
        System.out.println("Testing JavaRandomNumberGenerator:");
        try {
            randomNumberService.setRandomNumberGenerator(new RandomNumberGeneratorBuiltIn());
            int randomNum = randomNumberService.generateRandomNumber();
            System.out.println("Generated number: " + randomNum);
        } catch (Exception e) {
            System.err.println("Error in JavaRandomNumberGenerator: " + e.getMessage());
        }

        // Test SecureRandomNumberGenerator
        System.out.println("\nTesting SecureRandomNumberGenerator:");
        try {
            randomNumberService.setRandomNumberGenerator(new SecureRandomNumberGenerator());
            int randomNum = randomNumberService.generateRandomNumber();
            System.out.println("Generated number: " + randomNum);
        } catch (Exception e) {
            System.err.println("Error in SecureRandomNumberGenerator: " + e.getMessage());
        }
    }
}
