package org.howard.edu.lsp.assignment6;

//source: https://www.geeksforgeeks.org/arraylist-in-java/
//another source: https://www.tutorialspoint.com/java/java_documentation.htm

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a set of integers and provides methods for set operations
 * such as adding elements, removing elements, and checking if a set contains a certain element.
 * This class also provides methods to perform union, intersection, and difference
 */
public class IntegerSet {
		//store the set elements in ArrayList
		private List<Integer> set = new ArrayList<>();
		
		
		/**
		 * Default Constructor, initializes empty integer set
		 */
		public IntegerSet() 
		{
				
		}
		
		
		/**
		 * constructor if you want to pass in already initialized
		 * 
		 * @param set array list of integers to initialize set
		 */
		public IntegerSet(ArrayList<Integer> set) 
		{
			this.set = set;
			for (int value : set) 
			{
				add(value); // Uniqueness when initializing
			}
			
		}
		
		
		
		/**
		 * Clear all elements in set
		 */
		public void clear() 
		{
			set.clear();
			
		}
		
		
		
		/**
		 * Returns length of set (number of elements in set)
		 * 
		 * @return size of set
		 */
		public int length() {
			return set.size();
		}
		
		
		
		
		/**
		 * Comparing integerset with another integerset for equality
		 * Equal if both sets contain the same elements, and only those elements
		 * @param o, object for comparison
		 * @return true if sets equal, false otherwise
		 */
		public boolean equals(Object o) {
			
			if(this == o) return true;
			
			if (!(o instanceof IntegerSet)) return false;
			
			IntegerSet other = (IntegerSet) o;
			return this.set.containsAll(other.set) && other.set.containsAll(this.set);
			
			
		}
		
		
		
		/**
		 * check if set contains a value
		 * 
		 * @param value: the value that we check for in the set
		 * @return true if value is found in the set, false otherwise
		 */
		public boolean contains(int value) 
		{	
			return set.contains(value);		
		}
		
		
		/**
		 * Returns largest element in the integer set
		 * 
		 * @return largest integer
		 * throws illegalstateexception if the set is empty (No maximum can exist in this case)
		 */
		public int largest() {
			if (isEmpty()) throw new IllegalStateException("Empty set");
			int largest = set.get(0);
			for(int value : set) {
				if(value > largest) {
					largest = value;
					
				}
				
			}
			return largest;	
		}
		
		
		
		
		
		/**
		 * Returns smallest element in the integer set
		 * 
		 * @return smallest integer
		 * throws illegalstateexception if the set is empty (No minimum can exist in this case)
		 */
		public int smallest() {
			if (isEmpty()) throw new IllegalStateException("Empty set");
			int smallest = set.get(0);
			for(int value : set) {
				if(value < smallest) {
					smallest = value;
					
				}
				
			}
			return smallest;	
		}
		
		
		
		
		
	
		
		
		
		/**
		 * Adds value to integer set if not already in the set
		 * 
		 * @param item, value to add to set
		 */
		public void add (int item) 
		{
			if(!contains(item)) {
				set.add(item);
			}
			
		}
		
		
		
		
		/**
		 * Removes value from set if it exists
		 * 
		 * @param item, value to remove from set
		 */
		public void remove(int item) {
			set.remove((Integer) item);
			
		}
		
		
		
		/**
		 * performs union of integersetb with integerset
		 * 
		 * @param integerSetb unites with other set
		 */
		public void union(IntegerSet integerSetb) {
			
			for(int value : integerSetb.set) {
				add(value);
			}
			
		}
		
		
		
		/**
		 * performs intersection
		 * 
		 * @param integerSetb, the integer set to intersect with
		 */
		public void intersect(IntegerSet integerSetb) {
			List<Integer> intersection = new ArrayList<>();
			for (int value : set) {
				if (integerSetb.contains(value)) {
					intersection.add(value);
					
				}
			}
			set = intersection;
			
		}
		
		
		
		/**
		 * Performs difference of this set and other integer set
		 * Modifying set to consist of only elements not in the other set
		 * 
		 * @param integerSetb, the set integer set to subtract from this set
		 */
		public void diff(IntegerSet integerSetb) {
			List<Integer> difference = new ArrayList<>();
			for (int value : set) {
				if(!integerSetb.contains(value)) {
					difference.add(value);
					
				}
				
			}
			set = difference;
			
		}
		
		
		
		
		/**
		 * Performs complement of this set w.r.t other integerset
		 * modify to contain elements in other set not present in this one
		 * @param integerSetb, the set to compute complement with
		 */
		public void complement(IntegerSet integerSetb) {
			List<Integer> newSet = new ArrayList<>();
			for (Integer value : integerSetb.set) {
				if(!this.contains(value)) {
					newSet.add(value);
				}
			}
			
			this.clear();
			for(Integer value : newSet) {
				
				this.add(value);
				
			}
			
		}
		
		
		/**
		 * checks if set is empty
		 * @return true if set is empty; false otherwise
		 */
		public boolean isEmpty() {
			return set.isEmpty();
			
		}
		
		
		/**
		 * returns integer set converted to string
		 * @return a string containing all elements in the set
		 */
		public String toString() {
			
			return set.toString();
			
		}
		
		
		
		
		

	

}
