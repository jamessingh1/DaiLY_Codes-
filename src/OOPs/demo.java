package OOPs;
import java.util.Scanner;
class sum{
    public int add(int x, int y){
        int result = (x+y);
        return result;
    }
}

public class demo {

    // Let's Continue with OOPs concept 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to add: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum Sum = new sum();

        int r = Sum.add(a, b);

        System.out.println("Two sum addition is: " + r);

    }


    
}
