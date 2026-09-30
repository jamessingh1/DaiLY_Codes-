package Algomaster;
class check{
    int[] nums = {6,5,4,2,1,3};
    

    
    public int sort(){


        System.out.println("Elements before Sorting: ");
        for(int n : nums){
            System.out.print(n + " ");
        }

        int size = nums.length;
        int temp;

        for(int i = 0; i < size; i++){
            for(int j = 0; j<size-i-1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Elements after Sorting ");
        for(int n : nums){
            System.out.print(n + " ");
        }

        return 0;

    }
}

public class bubblesort{
    public static void main(String[] args) {
        check c1 = new check();
        System.out.println(c1.sort());
        }
    }
