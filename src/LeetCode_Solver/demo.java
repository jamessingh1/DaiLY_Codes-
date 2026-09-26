package LeetCode_Solver;
//import java.util.Scanner;

public class demo {
    public static void main(String args[]){
       int n = 121;
       int original = n;
       int rev = 0;
        

        while(n > 0){
            int digit = n%10;
            rev = rev * 10+digit;
            n = n/10;
        }
        if(original==rev){
            System.out.println("No.is Palindrome");
        }
        else{
            System.out.println("No. is not a palindrome u mc!");
        }
    }
    
}