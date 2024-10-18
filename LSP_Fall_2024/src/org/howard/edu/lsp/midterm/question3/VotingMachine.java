package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;


//sources: https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

//source: https://www.baeldung.com/java-map-to-string-conversion

public class VotingMachine {

	private Map<String, Integer> candidates; //make map for candidate and corresponding vote count
	
	//constructor
	public VotingMachine() 
	{
		candidates = new HashMap<>();
		
	}

	public void AddCandidate(String name) 
	{
		candidates.put(name, 0); 
		
	}
	
	public void CastVote(String name) 
	{
		
		candidates.put(name, candidates.get(name)+1); //increment vote count for chosen candidate
		
		
	}
	
	
	 public String toString() {   //convert to string
	        StringBuilder result = new StringBuilder("Votes:\n");
	        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
	            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
	        }
	        return result.toString();
	  }

	

}
