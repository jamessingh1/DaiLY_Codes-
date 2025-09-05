import java.util.Scanner;
class mobile{
    String Brand;
    static String Model;
    int price;

    void show(){
        System.out.println(" Brand: "  + Brand +" Model:  "  +  Model  + "  Sell Price:  " +  price );
    }

}
public class Day01 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.of mobile phones detail to be inserted: ");
        int n = sc.nextInt();

       mobile[] tck  = new mobile[n];


       for (int i = 0; i<n; i++){
           tck[i] = new mobile();

           System.out.println("Enter the Brand: ");
           tck[i].Brand = sc.next();
           System.out.println("Enter the Model: ");
           mobile.Model = sc.next();
           System.out.println("Enter the Price: ");
           tck[i].price = sc.nextInt();
       }

        System.out.println("The details Entered are: ");
        for (int i = 0; i < n; i++){
            tck[i].show();
        }
    }
}
