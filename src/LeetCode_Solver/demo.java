package LeetCode_Solver;
import java.util.Scanner;

public class demo {
    public static void main(String a[]){
    int nums[][] = new int[2][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements for the array(6 nos): ");
    for(int i = 0; i < 2; i++){
       for(int j = 0; j < 3; j++){
           nums[i][j] = sc.nextInt();
       }
    }

    System.out.println("\n The 2D stored array is: ");
    for(int n[] : nums){
       for(int m : n){
            System.out.println(m + " ");
       } 
       System.out.println();
    }
}
}