public class Day_06 {
    // Merge Sort

    public static void mergesort(int[] arr, int l, int r) {

        if (l < r) {
            int m = (l + r)/ 2;
            mergesort(arr, l, m); //[8,9,2,1]
            mergesort(arr, m + 1, r);//[5,4,7]

            merge(arr, l, m, r);
        }

    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int x = 0; x<n1; x++){
            larr[x] = arr[l + x];
        }
        for(int x = 0; x<n2; x++){
            rarr[x] = arr[m + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,9,2,1,5,4,7};

        for(int n: arr){
            System.out.print(n + " ");
        }

        mergesort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("After Sorting");
        for(int n: arr){
            System.out.print(n + " ");
        }
    }
}
