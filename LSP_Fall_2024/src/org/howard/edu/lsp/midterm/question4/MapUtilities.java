package org.howard.edu.lsp.midterm.question4;

//source:GeeksforGeeks - How to Compare Two HashMaps in Java

import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        
        int commonCount = 0;
        // Loop through the first map
        for (String key : map1.keySet()) {
            // Check if the key in both maps and the values are equal
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }
        return commonCount;
    }
}


