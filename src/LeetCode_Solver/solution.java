//package LeetCode_Solver;
import java.util.ArrayList;
import java.util.List;


// This class contains the logic to build the triangle list
class Solution {
    public List<String> invertedRightAngledTriangle(int n) {
        List<String> result = new ArrayList<>();
        
        // Outer Loop: Counts down row by row (e.g., from 5 down to 1)
        for (int i = n; i >= 1; i--) {
            String row = "";
            
            // Inner Loop: Runs 'i' times to build the current row of stars
            for (int j = 0; j < i; j++) {
                row = row + "*";
            }
            
            // Add the completed row to our dynamic list
            result.add(row);
        }
        
        return result;
    }
}

// This is the main class that executes on your device
public class solution {
    public static void main(String[] args) {
        Solution solver = new Solution();
        
        // Let's test it with an inverted triangle of size 5
        int n = 5; 
        List<String> triangleList = solver.invertedRightAngledTriangle(n);
        
        System.out.println("Printing an Inverted Triangle of size " + n + ":");
        System.out.println("----------------------------------------");
        
        // This loop reads our List item by item and prints it out
        for (String row : triangleList) {
            System.out.println(row);
        }
    }
}
