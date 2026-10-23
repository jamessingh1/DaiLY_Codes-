package OOPs;
import java.util.Scanner;
public class part {
    public static void main(String[] args){
        int x,y,z;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the values for x,y & z: ");
         x = sc.nextInt();
         y = sc.nextInt();
         z = sc.nextInt();

        int result = x*y*z;
        System.out.println("The values after multiplying the digits are: " + result);
    }
    
}
