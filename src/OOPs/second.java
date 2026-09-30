package OOPs;
class solution{
    public void secondlargest(int[] nums){
        int largestnumber= nums[0];
        int second = nums[0];
        for(int n:nums){
            if(n > largestnumber){
            second = largestnumber;
            largestnumber = n;
            }
            else if(n < largestnumber && n > second){
            second = n;
        }
    }

        System.out.println("The largest number is:  " + largestnumber);
         System.out.println("The Second largest is:  " + second);
        
    }
}
public class second{
     public static void main(String[] args) {
        int[] nums = {12,56,78,3,4,12,5};
        solution s1 = new solution();
        s1.secondlargest(nums);
    }
}