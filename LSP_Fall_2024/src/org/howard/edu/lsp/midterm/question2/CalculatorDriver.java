package org.howard.edu.lsp.midterm.question2;

public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // calculator instance
        
        System.out.println(calculator.sum(5, 10));                    // 15
        System.out.println(calculator.sum(3.5, 7.8));                 // Output: 11.3
        System.out.println(calculator.sum(new int[]{1, 2, 3, 4, 5})); // Output: 15
    }
}
