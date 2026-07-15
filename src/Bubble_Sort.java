public class Bubble_Sort {
    public static void main(String[] args) {
        int[] nums = {1,26,39,3,59};
        int size = nums.length;
        int temp = 0;

        System.out.println("Elements Before sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }

        System.out.println();
        System.out.println("Elements After sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
