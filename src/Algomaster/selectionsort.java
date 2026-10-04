import java.util.Scanner;
public class selectionsort{
    public static void main (String[] args){
        int[] nums = new int[6];
        
        int size = nums.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<nums.length;i++){
            System.out.print("Index " + i + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\n Stored array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        int minIndex = -1;
        int temp = 0;
        for(int i = 0; i<size; i++){
           minIndex = i;
           for(int j = 1; j < size-1; j++){
               if(nums[minIndex] > j){
                minIndex = j;   
               } 
           }
                 temp = nums[minIndex];
                   nums[minIndex] = nums[i];
                   nums[i] = temp;
        }
        System.out.println("\n Sorted order array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        
    }
}