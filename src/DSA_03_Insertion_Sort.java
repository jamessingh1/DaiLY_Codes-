public class DSA_03_Insertion_Sort {
    // Insertion Sort
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,8,3};
        int size=nums.length;

        for(int i = 0; i<size; i++){
            int key = nums[i];
            int j = i-1;
            while(j>0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int num: nums){
            System.out.print(num + " ");
        }

    }
}
