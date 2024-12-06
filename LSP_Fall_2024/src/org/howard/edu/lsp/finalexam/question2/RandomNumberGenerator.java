package org.howard.edu.lsp.finalexam.question2;

//source: https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
//source: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
//source: https://www.geeksforgeeks.org/generating-random-numbers-in-java/
//source: https://github.com/openjdk/jdk/blob/master/src/java.base/share/classes/java/security/SecureRandom.java?utm
//source: https://www.baeldung.com/java-secure-random?

/**
 * Strategy interface for generating random numbers.
 */
public interface RandomNumberGenerator {
    /**
     * Generate positive random integer.
     *
     * @return positive random integer.
     */
    int generateRandomNumber();
}



