package LeetCode_Solver;
//import java.util.Scanner;
import java.util.Arrays;

public class demo {
    public static void main(String args[]){
       int[] nums = {9,8,6,5,2,3};
       int k = 2;
       System.out.println(Arrays.toString(rotate(nums, k)));

    }

    public static void reverse(int[] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;

        }
    }

    public static int[] rotate(int[] nums, int k){
        int n = nums.length;
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
        return nums;
    }


    
}