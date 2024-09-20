package org.howard.edu.lsp.assignment2;

/**
*  Name: Chase Adams IV
*/
//>>>>>>> branch 'main' of https://github.com/swish638/LSP_Repo_kfmeknt5.git



//package org.howard.edu.lsp.assignment2;

//public class wordCounter {
//
//}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;


public class assignment2 {
    public static void main(String[] args) {
    	String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";    
    	//String fileName = "ver4testinputfile.txt"; // The path to the file
    	HashMap<String, Integer> tokenCounts = new HashMap<>();

    	try {
    		// trying to alter the delimiters
    		Scanner scanner = new Scanner(new File(fileName)).useDelimiter("[\\?,.:;\"'`\\!\\(\\)\t 0 1 2 3 4 5 6 7 8 9 \n\s- ]");
    		//int tokenCounts = 0;
    		// Reading the file word by word (token by token)
    		while (scanner.hasNext()) {
    			String token = scanner.next().toLowerCase(); // Convert to lowercase for case-insensitive counting
    			//int tokenlength = token.length();
    			//System.out.println(tokenlength);
    			// check if token has 4 or more chars
    			if (token.length() >= 4) {
    			tokenCounts.put(token, tokenCounts.getOrDefault(token, 0) + 1); // Increment the count for each token
    			}
    		}
    		

    	    scanner.close();
    	} catch (FileNotFoundException e) {
    		 e.printStackTrace();
    	}

    	// Print the token counts
    	// is this the place to exclude printing the tokens whose length is 3 or less
    	for (String token : tokenCounts.keySet()) {
    		//if (token.length()>=4) {
    		System.out.println(token + ": " + tokenCounts.get(token));
    			//System.out.println(tokenlength);	
    
    	
    		
    	}	
    System.out.println("Does remove delimiters \n Does Did take in text file (ver4testinputfile.txt) saved in Eclipse environment \n "
    		+ "Errors: does not exclude all words of length less than 3 \n "
    		+ "does not count length of all words - maybe copy and paste into the .txt file from word docuemnt carried with "
    		+ "it extra formating \n tried to make all spaces either one space bar or one newline"
    		);
    }
}	


//for (String word : words) {
    // Check if the word has 4 or more characters
  //  if (word.length() >= 4) {
    //    count++; // Increment the count if condition is met
    // }