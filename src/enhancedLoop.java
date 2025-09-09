import java.util.*;
public class enhancedLoop {
    public static void main(String[] args) {
        int[] dogs = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int i = 0;
        for(int gk : dogs){
            dogs[i] = sc.nextInt();
            i++;
        }
        System.out.println("The Entered Numbers are: ");
        for (int n : dogs){
            System.out.print(n + " ");
        }
    }
}
