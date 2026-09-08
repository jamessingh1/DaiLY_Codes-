package LeetCode_Solver;

public class hello {

    public static void main (String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 8;

        rotateleft(nums,k);

        for (int num: nums){
            System.out.print(num + " ");
        }
    }

    public static void rotateleft(int[] nums, int k) {

        k = k % nums.length;

        for(int j = 0; j < k; j++){
            int first = nums[0];

            for(int i = 0; i < nums.length - 1; i++){
                nums[i] = nums[i+1];
            }

            nums[nums.length - 1] = first;
        }
    }
    
}
