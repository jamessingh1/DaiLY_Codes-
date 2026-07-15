public class Selection_Sort {
    public static void main(String[] args) {
        int[] nums = {20,8,99,17,12,7,3,4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.print("Elements before Sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }

        for(int i = 0; i<size; i++){
            minIndex = i;
            for(int j = i+1; j<size; j++){
                if(nums[minIndex] > nums[j]){
                    temp = nums[minIndex];
                    nums[minIndex] = nums[j];
                    nums[j] = temp;

                    for (int num: nums){
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.print("Elements after Sorting: ");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }
}
