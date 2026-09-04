package LeetCode_Solver;

public class repeating_no {

    public static int Repeating(int[] nums){

       //  int maxcount = 0;
       // int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {0,0,0,1,3,7};
        int result = Repeating(nums);
        System.out.println("Maximum Consecutive nos: " + Repeating(nums));
        System.out.println("Repeating no is: " + result);
    }
    
}
