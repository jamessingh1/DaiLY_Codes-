package OOPs;

public class ok {
    public static void main(String args[]){
        int marks[][] = new int[4][5];

        for(int i = 0; i<4; i++){
        
            for(int j = 0; j<5; j++){
                 marks[i][j] = (int)(Math.random()*10);
            }
            
        }

        for(int i = 0; i<4; i++){
        
            for(int j = 0; j<5; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
