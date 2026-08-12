package Searches;
public class LinearSearch {
    public  static void main(String[] args){
        int[] arr = {4,9,1,78,12,5,6,7,8,9,10};
        int target = 7;

        int result  = linearsearch (arr, target);

        if (result != -1)
            System.out.println("Element found at Index: " + result);
        else
            System.out.println("Element not found");
    }

    public static int linearsearch(int[] arr, int target){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;

    }
}