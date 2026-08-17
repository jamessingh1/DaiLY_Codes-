package LeetCode_Solver;

public class Day_01 {
    public static void main(String[] args) {
        int[] nums = {5,8,7,31,10,14}; 
        
        System.out.println(largestElement(nums));
    }

    public static int largestElement(int[] nums){
            int largestElement = nums[0];

            for(int i = 0; i < nums.length; i++){
                if(largestElement < nums[i]){
                    largestElement = nums[i];
                }
            }
            return largestElement;
           
        }

}
