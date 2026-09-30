import java.util.Scanner;
public class selectionsort{
    public static void main (String[] args){
        int[] nums = new int[9];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i<nums.length;i++){
            System.out.println("Index " + i + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.println("\n Stored array: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}