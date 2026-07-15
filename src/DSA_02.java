public class DSA_02 {

    // Bubble Sorting

    public static void main(String[] args) {
        int[] nums = {9,6,2,5,4,1};
        int size = nums.length;
        int temp = 0;

        System.out.print("Before Sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.print("After Bubble Sort: ");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
