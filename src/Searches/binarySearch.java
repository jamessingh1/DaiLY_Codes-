package Searches;

public class binarySearch {
    public static void main(String[] args){
        int[] arr={30,31,32,37,39,45};
        int target = 39;

        int result = BinarySearch(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println("Element not found!");
        }

    }

    public static int BinarySearch(int[] arr, int target){
        // arr = 30,31,32,37,39,45
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
         int mid = (left+right)/2;
        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target){
            left = mid+1;
        }
        else
            right = mid-1;
        }
  
     return -1;
    }
    
}
