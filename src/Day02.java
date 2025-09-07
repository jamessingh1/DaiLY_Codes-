public class Day02 {
    public static void main(String[] args) {
        int[][] xyz = new int[2][];
        xyz[0] = new int[1];
        xyz[1] = new int[4];

        for(int i = 0; i < xyz.length; i++){
            for(int j = 0; j < xyz[i].length; j++){
                xyz[i][j] = (int)(Math.random()*10);
            }
            for(int n[] : xyz){
                for (int m : n){
                    System.out.print(m + " ");
                }
                System.out.println(" ");
            }

        }

    }
}
