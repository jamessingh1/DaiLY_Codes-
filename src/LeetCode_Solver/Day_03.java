package LeetCode_Solver;

class Day_03{

    public static void main(String[] args){

        int[] nums = {1,2,3,4,5};

        LRA(nums);

        for(int num : nums){
            System.out.print(num + " ");
        }      
    }

    public static void LRA (int[] nums){
        int temp = nums[0];
        for(int i=0; i< nums.length - 1; i++){
            nums[i] = nums[i+1];
        }

        nums[nums.length - 1] = temp;

    } 
}