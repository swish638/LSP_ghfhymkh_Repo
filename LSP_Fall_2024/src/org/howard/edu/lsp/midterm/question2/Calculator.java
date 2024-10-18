package org.howard.edu.lsp.midterm.question2;


//source: https://stackoverflow.com/questions/4550662/how-do-you-find-the-sum-of-all-the-numbers-in-an-array-in-java

public class Calculator 
{
	public static int sum(int a, int b) 
	{
		return a+b;
		
	}
	
	
	
	public double sum(double a, double b) 
	{
		return a + b;
		
	}
	
	
	
	public int sum(int[] numbers)  //passing in array
	{
		int total = 0;
		for (int number : numbers)  //for loop to add individual elements (numbers) in array
		{
			total += number;
		}
		return total;
	}
	
	

	
}
