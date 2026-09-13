package LeetCode_Solver;

public class ok {
    public static void main (String[] args){
        int[] nums = {0,0,3,3,5,6};
        removeDuplicates(nums);

        for(int num: nums){
        System.out.print(num + " ");
    }
}
    public static int removeDuplicates(int[]nums){
        int i = 0;
       // for(int i =0; i < nums.length; i++){
            for(int j = 1; j< nums.length; j++){
                if(nums[i] != nums[j]){
                    nums[i+1] = nums[j];
                    i++;
                }

           // }
        }
        return i+1;
    }
}
