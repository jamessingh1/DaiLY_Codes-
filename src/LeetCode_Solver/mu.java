package LeetCode_Solver;

public class mu {
    public static void main(String[] a){
        int arr[][][] = new int[2][4][6];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 6; k++){
                    arr[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }

        for(int n[][] : arr){
            for(int m[] : n){
                for(int p : m){
                    System.out.print(p + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
