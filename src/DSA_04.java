public class DSA_04 {
    // Quick Sort

    public static void quicksort(int[] arr, int left, int right){
        if(left<right){

            int pi = partition(arr, left, right);

            quicksort(arr, left, pi-1);
            quicksort(arr, pi+1, right);


        }
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {8,2,7,1,0,3,4,9,};

        quicksort(arr, 0, arr.length-1);

        for(int nums: arr){
            System.out.print(nums + " ");
            System.out.print(nums + " ");
        }
    }
}