package LeetCode_Solver;

public class duffer {
    public static void main(String[] args){
        int[] nums = {1,0,2,4,5,0};
        shiftZero(nums);
        for(int num: nums){
           System.out.print( num + "  " );
        }
    }

    public static void shiftZero(int[]nums){
        int j =0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
}
