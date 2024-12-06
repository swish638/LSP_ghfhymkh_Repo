package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


class TestMathUtils {
	
	@Test
	@DisplayName("Test case 1 for factorial: positive")
	void FactorialWithPositiveInput() 
	{
		MathUtils math = new MathUtils();
		assertEquals(6, math.factorial(3), "Should compute normally");
		
	}	
	
	
	
	@Test
	@DisplayName("Test case 2 for factorial: Input is 0")
	void FactorialWithZeroInput() 
	{
		MathUtils math = new MathUtils();
		assertEquals(1, math.factorial(0), "0 factorial = 1");
		
	}
	
	
	@Test
	@DisplayName("Test case 3 for factorial: Input is 1")
	void FactorialWithOneInput() 
	{
		MathUtils math = new MathUtils();
		assertEquals(1, math.factorial(1), "1 factorial = 1");
		
	}
	
	
	@Test
	@DisplayName("Test case 4 for factorial: negative input")
	void FactorialWithNegativeInput() 
	{
		MathUtils math = new MathUtils();
		assertThrows(IllegalArgumentException.class, () -> math.factorial(-2));
		
	}
	
	
	
	
	
	
	
	

	
	@Test
	@DisplayName("Test case 1 for prime: Input is negative number")
	void PrimeWithNegativeNumber()
	{
		MathUtils math = new MathUtils();
		assertFalse(math.isPrime(-6));
	}
	
	
	
	
	@Test
	@DisplayName("Test case 2 for prime: Input is 1")
	void PrimeWithOne()
	{
		MathUtils math = new MathUtils();
		assertFalse(math.isPrime(1));
	}
	
	
	
	
	@Test
	@DisplayName("Test case 3 for prime: Input is zero")
	void PrimeWithZero()
	{
		MathUtils math = new MathUtils();
		assertFalse(math.isPrime(0), "cannot divide by zero");
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 4 for prime: false for non-prime numbers")
	void PrimeWithNonPrimeNumbers()
	{
		MathUtils math = new MathUtils();
		assertFalse(math.isPrime(40));
		assertFalse(math.isPrime(1000));
		
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 5 for prime: true prime numbers")
	void PrimeWithPrimeNumbers()
	{
		MathUtils math = new MathUtils();
		assertTrue(math.isPrime(7));
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test
	@DisplayName("Test case 1 for GCD: both inputs are zero")
	void GcdWithBothInputsZero(){
		MathUtils math = new MathUtils();
		assertThrows(IllegalArgumentException.class, () -> math.gcd(0, 0), "can't both be 0");
	
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 2 for GCD: one input is negative")
	void GcdWithOneNegOnePos(){
		MathUtils math = new MathUtils();
		assertEquals(7, math.gcd(-7,14));
		assertEquals(8, math.gcd(8, -32));
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 3 for GCD: both negative")
	void GcdWithBothNeg(){
		MathUtils math = new MathUtils();
		assertEquals(7, math.gcd(-7,-14));
		assertEquals(8, math.gcd(-8, -32));
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 4 for GCD: one input is zero, other non-zero")
	void GcdwithZeroAndNonZeroInput(){
		MathUtils math = new MathUtils();
		assertEquals(5, math.gcd(0,5));
	}
	
	
	
	
	
	@Test
	@DisplayName("Test case 5 for GCD: both same")
	void GcdwithTwoSameInput(){
		MathUtils math = new MathUtils();
		assertEquals(10, math.gcd(-10,-10));
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

}
