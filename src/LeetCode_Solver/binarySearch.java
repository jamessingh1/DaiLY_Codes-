package LeetCode_Solver;
class solution{
    int nums[] = {7,8,9,13,18,19,20};
    int target = 18;
    //int mid = 0;
  public int BINARYSEARCH(){ //it will return only it's index value
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
             int mid = (left + right)/2;

            if (nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else 
                right = mid - 1;
        }
        return -1;
    }
    
}
public class binarySearch{
    public static void main(String[] args) {
        solution s1 = new solution();
        
        System.out.println(s1.BINARYSEARCH());
    }
}