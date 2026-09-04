package LeetCode_Solver;

public class solver {

    public static int Maxconsecutive(int[] arr){

        int maxCount = 0;
        int Count = 0;

        for(int arrs : arr){
            if (arrs == 1){
                Count++;
                maxCount = (Count > maxCount) ? Count : maxCount;
            }
            else{
                Count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args){
        // Finding out the consecutive repeating number
        int[] arr = {1,1,0,0,0,1,1,1,1,1,0,1};
        System.out.println("Max Consecutive 1s: " + Maxconsecutive(arr));
    }
    
}
