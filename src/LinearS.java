import static java.util.Arrays.binarySearch;

public class LinearS {

    public static void main(String[] args) {

        int nums[] = {70, 80, 90, 100, 120};
        int target = 120;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if (result1 != -1)
            System.out.println("Element found at Index: " + result1);
        else
            System.out.println("Element not found");
    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return -1;
    }
}


