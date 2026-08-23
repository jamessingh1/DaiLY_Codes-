package LeetCode_Solver;

public class Day_02 {

public static void main(String[] args) {
    
    int[] nums = {8,0,10,12,1,8};

    System.out.println(SecondLargestNumber(nums));
}

    public static int SecondLargestNumber(int[] nums){
    int largest = nums[0];
    int secondlargest = nums[0];

    for(int i = 1; i < nums.length; i++){
        if(nums[i] > largest){
            secondlargest = largest;
            largest = nums[i];
        }
        else if(nums[i] > secondlargest && nums[i] != largest){
            secondlargest = nums[i];
        }

    }   
    if (largest == secondlargest)
        return -1; 

    return secondlargest;

}     
}


