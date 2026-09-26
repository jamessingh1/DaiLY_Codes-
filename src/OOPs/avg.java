package OOPs;

class solution{
    public double arrayAverage(int[] nums){
        float sum = 0;
        float average = 0;
        for(int n:nums){
            sum += n;
        }
        average = sum/nums.length;
        return average;
    }
}
public class avg{
    public static void main(String[] args){
        int[] nums = {2,4,6,8,10,12,16,19};
        solution sol = new solution();
        //sol.arrayAverage(nums);
        System.out.println("average of the array element: " + sol.arrayAverage(nums));
    }
}