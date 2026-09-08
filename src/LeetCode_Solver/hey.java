package LeetCode_Solver;

import java.util.ArrayList;
import java.util.Scanner;

public class hey {
    public static void main(String a[]){

    Scanner sc = new Scanner(System.in);
    
    ArrayList<Integer> arr = new ArrayList<>();

    System.out.print("Enter numbers for array (-1 to stop): ");

    while(true){
        int num = sc.nextInt();

        if (num == -1){
            break;
        }

        arr.add(num);
    }

    System.out.println(arr);
    }
}
