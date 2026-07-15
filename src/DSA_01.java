public class DSA_01 {

    // Binary_Search using Recursion

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50};
        int target = 50;

        int result = binarysearch(nums, target, 0 , nums.length-1);

        if(result != -1)
            System.out.println("Element found at index: " +result);
        else
            System.out.println("Element not fetch");
    }

    public static int binarysearch(int[] nums, int target, int left, int right) {

        if (left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                return binarysearch(nums, target, mid + 1, right);
            }
            else
                return binarysearch(nums, target, left, mid - 1);
        }

        return -1;
    }
}
