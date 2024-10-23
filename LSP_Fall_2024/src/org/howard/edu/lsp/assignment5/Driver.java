package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Create first IntegerSet
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create the second IntegerSet
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println("Value of Set2 is: " + set2.toString());

        // Union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 before union: " + set1.toString());
        System.out.println("Value of Set2: " + set2.toString());
        
        set1.union(set2); // Perform union
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());
        
        // Intersecting Set1 and Set2
        IntegerSet set3 = new IntegerSet();
        set3.add(2);
        set3.add(3);
        
        System.out.println("Value of Set3 is: " + set3.toString());
        System.out.println("Intersecting Set1 and Set3");
        System.out.println("Value of Set1 before intersection: " + set1.toString());
        System.out.println("Value of Set3: " + set3.toString());
        
        set1.intersect(set3); // Perform intersection
        System.out.println("Result of intersection of Set1 and Set3: " + set1.toString());

        // Set Difference
        System.out.println("Difference of Set1 and Set2");
        IntegerSet set4 = new IntegerSet();
        set4.add(3);
        set4.add(7);
        set4.add(8);
        set4.add(9);
        System.out.println("Value of Set4 is: " + set4.toString());
        set4.diff(set2); //difference
        System.out.println("Result of difference of Set4 and Set2: " + set4.toString());
        
        // Complement
        IntegerSet set5 = new IntegerSet();
        set5.add(1);
        set5.add(2);
        set5.add(3);
        set5.add(4);
        
        System.out.println("Value of Set5 is: " + set5.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set5.complement(set2); // Perform complement
        System.out.println("Result of complement of Set5 with Set2: " + set5.toString());
        
        // Clear the set
        set5.clear();
        System.out.println("Value of Set5 after clearing: " + set5.toString());
    }
}
