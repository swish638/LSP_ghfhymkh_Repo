package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

//source:  https://junit.org/junit5/docs/current/user-guide/
//source:  https://www.vogella.com/tutorials/JUnit/article.html

class TestIntegerSet {

	@Test
	@DisplayName ("Test case for clearing")
	void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.clear();
        assertEquals(0, set.length(), "Set should be empty after clear()");
	}
	
	
	
	@Test
	@DisplayName ("Test case for length of set")
	void testLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.add(3);
        assertEquals(3, set.length(), "Set should have length of 3 after adding 3 elements");
        set.clear();
        assertEquals(0, set.length(), "Empty set should have length 0");
	}
	
	
	
	@Test
	@DisplayName ("Test case for equivalent sets")
	void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        assertTrue(set1.equals(set2), "Both sets are empty so they should be equal");
        set1.add(1);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with the same elements should be equal");
        set2.add(2);
        assertFalse(set1.equals(set2), "Sets with different elements should not be equal");
        set1.clear();
        set2.clear();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets with the same elements in different order should be equal");
	}
	
	
	
	@Test
	@DisplayName("Test case for equals with itself")
	void testEqualsWithSelf() {
	    IntegerSet set1 = new IntegerSet();
	    set1.add(1);
	    set1.add(2);
	    assertTrue(set1.equals(set1), "A set should be equal to itself");
	}
	
	
	
	@Test
	@DisplayName("Test equals with sets of different sizes")
	void testEqualsDifferentSizes() {
	    IntegerSet set1 = new IntegerSet();
	    IntegerSet set2 = new IntegerSet();
	    
	    set1.add(1);
	    set1.add(2);
	    
	    set2.add(1);
	    
	    assertFalse(set1.equals(set2), "Sets of different sizes should not be equal, even if one is a subset of the other");
	    assertFalse(set2.equals(set1), "Equality should be symmetric; sets of different sizes should not be equal");
	}
	
	
	
	
    @Test
    @DisplayName("Test case for containing element")
    void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        assertTrue(set.contains(1), "Set should contain 1");
        assertFalse(set.contains(2), "Set should not contain 2");
        set.add(245);
        assertTrue(set.contains(245), "Set should contain 1");
    }
    
    
    
    
    @Test
    @DisplayName("Test case for largest element in set (with non-empty set)")
    void testLargest() throws EmptySetException {
    	IntegerSet set = new IntegerSet();
    	set.add(3);
    	set.add(4);
    	set.add(946);
    	assertEquals(946, set.largest(), "Largest element is 946");
    	
    	set.clear();
    	
    	set.add(10);
    	assertEquals(10, set.largest(), "Largest element is 10");
    	
    }
    
    
    @Test
    @DisplayName("Test largest with negative and positive values")
    void testLargestWithMixedValues() throws EmptySetException {
        IntegerSet set = new IntegerSet();
        set.add(-10);
        set.add(5);
        set.add(-7);
        assertEquals(5, set.largest(), "Largest element should be 5 with mixed negative and positive values");
    }
    
    
    @Test
    @DisplayName("Test largest with empty set")
    void test_EmptySetExceptionOnLargest() throws EmptySetException {
    	IntegerSet set = new IntegerSet();
    	set.clear();
    	Throwable exception = assertThrows(EmptySetException.class, () -> set.largest() );
    	assertNotNull(exception.getMessage());
    	
    }
    
    
    
    
    @Test
    @DisplayName("Test smallest with empty set")
    void test_EmptySetExceptionOnSmallest() throws EmptySetException {
    	IntegerSet set = new IntegerSet();
    	set.clear();
    	Throwable exception = assertThrows(EmptySetException.class, () -> set.smallest() );
    	assertNotNull(exception.getMessage());
    	
    }
    
    @Test
    @DisplayName("Test case for smallest element in set (with non-empty set)")
    void testSmallest() throws EmptySetException {
    	IntegerSet set = new IntegerSet();
    	set.add(3);
    	set.add(4);
    	set.add(946);
    	assertEquals(3, set.smallest(), "Smallest element is 3");
    	
    	set.clear();
    	
      	set.add(10);
    	assertEquals(10, set.smallest(), "Smallest element is 10");
    }
    
    
    
    
    
    
    
    @Test
    @DisplayName("Test smallest with negative and positive values")
    void testSmallestWithMixedValues() throws EmptySetException {
        IntegerSet set = new IntegerSet();
        set.add(-10);
        set.add(5);
        set.add(-7);
        assertEquals(-10, set.smallest(), "Smallest element should be -10 with mixed negative and positive values");
    }

    
    
    @Test
    @DisplayName("Test case for adding")
    void testAdd() {
    	IntegerSet set = new IntegerSet();
    	set.add(1);
    	set.add(1);
    	assertEquals(1, set.length(), "Adding duplicates shouldn't increase size");
    	assertTrue(set.contains(1), "Set should still contain 1");
    	set.clear();
    	set.add(2);
    	set.add(0);
    	assertEquals(2, set.length(), "set has 2 distinct elements");
    	assertTrue(set.contains(0) && set.contains(2), "set contains 0 and 2");
    }  
    
    
    
    
    @Test
    @DisplayName("Test case for remove")
    void testRemove() {
    	IntegerSet set = new IntegerSet();
    	set.add(1);
    	set.add(2);
    	set.remove(1);
    	assertFalse(set.contains(1), "Set should not contain 1 after removal");
    	assertEquals(1, set.length(), "Set should have 1 element");
    	
    }
    
    
    
    @Test
    @DisplayName("Test case for removing non-existent element")
    void testRemoveNonExistent() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.remove(2); // Attempt to remove an element not in the set
        assertEquals(1, set.length(), "Removing non-existent element should not change size");
        assertTrue(set.contains(1), "Set should still contain original element");
    }
    
    
    
    @Test
    @DisplayName("Test case for union")
    void testUnion() {
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	set1.add(1);
    	set1.add(2);
    	set2.add(2);
    	set2.add(3);
    	set2.add(4);
    	set1.union(set2);
    	assertTrue(set1.contains(1), "Set should contain 1");
    	assertTrue(set1.contains(2), "Set should contain 2");
    	assertTrue(set1.contains(3), "Set should contain 3");
    	assertTrue(set1.contains(4), "Set should contain 4");
    	
    	assertEquals(4, set1.length(), "Union should not have duplicate elements");
    } 
    
    
    
    
    
    
    
    @Test
    @DisplayName("Test union with empty sets")
    void testUnionWithEmptySets() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        set1.union(set2);
        assertTrue(set1.isEmpty(), "Union of two empty sets should be empty");
        
        set1.add(1);
        set1.union(set2);
        assertEquals(1, set1.length(), "Union of a non-empty set w/ empty set should keep original elements");
        assertTrue(set1.contains(1), "Union should contain the existing element from set1");

        set1.clear();
        set2.add(2);
        set1.union(set2);
        assertEquals(1, set1.length(), "Union of an empty set with a non-empty set should add elements from the non-empty set");
        assertTrue(set1.contains(2), "Union should contain the element from set2");
    }
	
    
    
    
    @Test
    @DisplayName("Test union with unique elements in each set")
    void testUnionUniqueElements() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.union(set2);
        assertEquals(4, set1.length(), "Union should contain all unique elements from both sets");
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3) && set1.contains(4), "Union should have all elements from both sets");
        ArrayList<Integer> expectedValues = new ArrayList<>(List.of(1, 2, 3, 4));
        assertTrue(set1.toString().equals(expectedValues.toString()), "Union should contain only unique elements [1, 2, 3, 4]");
    }
    
    
    
    
    
    @Test
    @DisplayName("Test case for Intersection")
    void testIntersect() {
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	set1.add(1);
    	set1.add(2);
    	set2.add(2);
    	set2.add(3);
    	set2.add(4);
    	set1.intersect(set2);
    	assertTrue(set1.contains(2) && set1.length() == 1, "Set should contain the one common element");
    	
    }
    
    
    
    
    
    
    @Test
    @DisplayName("Test intersection with empty sets")
    void testIntersectWithEmptySets() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        set1.intersect(set2);
        assertTrue(set1.isEmpty(), "Intersection of two empty sets should be empty");
        
        set1.add(1);
        set1.intersect(set2);
        assertTrue(set1.isEmpty(), "Intersection of a non-empty set with  empty set should be empty");

        set1.clear();
        set2.add(2);
        set1.intersect(set2);
        assertTrue(set1.isEmpty(), "Intersection of an empty set with non-empty set should be empty");
    }
    
    
    
    @Test
    @DisplayName("Test intersection with unique elements in each set")
    void testIntersectUniqueElements() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
        set1.intersect(set2);
        assertTrue(set1.isEmpty(), "Intersection of sets with no common elements should be empty");
    }
    
    
    
    @Test
    @DisplayName("Test case for Difference")
    void testDifference() {
    	IntegerSet set1 = new IntegerSet();
    	IntegerSet set2 = new IntegerSet();
    	set1.add(1);
    	set1.add(2);
    	set2.add(2);
    	set2.add(3);
    	set1.diff(set2);
    	assertTrue(set1.contains(1) && !set1.contains(2), "Should remove element(s) sets have in common");
    	
    }
    
    
    
    
    @Test
    @DisplayName("Test difference with empty sets")
    void testDifferenceWithEmptySets() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        set1.diff(set2);
        assertTrue(set1.isEmpty(), "Difference of two empty sets should be empty");
        
        set1.add(1);
        set1.diff(set2);
        assertEquals(1, set1.length(), "Difference of a non-empty set with an empty set should keep original elements");
        assertTrue(set1.contains(1), "Difference should contain element(s) from set1");

        set1.clear();
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.isEmpty(), "Difference of an empty set with a non-empty set should be empty");
    }
    
    
    
    
    
    
    @Test
    @DisplayName("Test case for complement")
    void testComplement() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.complement(set2);
        assertTrue(set1.contains(3) && !set1.contains(1), "Complement should replace elements in set1 with those in set2 that were not in set1");
    }
    
    
    
    
    @Test
    @DisplayName("Test complement with complete overlap")
    void testComplementWithCompleteOverlap() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        set2.add(1);
        set2.add(2);
        set2.add(3);
        
        set1.complement(set2);
        
        assertTrue(set1.isEmpty(), "Complement of two completely overlapping sets should result in empty set1");
    }
    
    
    
    
    
    
    @Test
    @DisplayName("Test case for complement with no overlap")
    void testComplementNoOverlap() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.complement(set2);
        assertEquals(1, set1.length(), "Complement should replace all elements in set1 with non-overlapping elements from set2");
        assertTrue(set1.contains(2) && !set1.contains(1), "Set1 should only contain element from set2");
    }

    
    
    
    @Test
    @DisplayName("Test case for isEmpty")
    void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty(), "Newly created set should be empty");
        set.add(1);
        assertFalse(set.isEmpty(), "Set with elements should not be empty");
        set.remove(1);
        assertTrue(set.isEmpty(), "Removed all elements from set, should be empty");
    }
    
    
    
    
    @Test
    @DisplayName("Test combining operations")
    void testCombinedOperations() {
    	
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set3.add(3);
        set3.add(4);
        set3.add(5);

        set1.union(set2);
        assertEquals(4, set1.length(), "After union, set1 should contain 4 unique elements");
        assertTrue(set1.contains(1) && set1.contains(2) && set1.contains(3) && set1.contains(4), "Set1 should contain elements {1, 2, 3, 4} after union with set2");

        set1.intersect(set3);
        assertEquals(2, set1.length(), "After intersection, set1 should contain 2 elements");
        assertTrue(set1.contains(3) && set1.contains(4), "Set1 should contain elements {3, 4} after intersecting with set3");

    }

    
    
    


    
    
    
    
    @Test
    @DisplayName("Test case for toString")
    void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "toString should display all elements in the set");
    }
    
    
    
    @Test
    @DisplayName("Test toString with empty set")
    void testToStringWithEmptySet() {
        IntegerSet set = new IntegerSet();
        assertEquals("[]", set.toString(), "Empty set should be represented as []");
    }
    
    
    
    
    
    

}
