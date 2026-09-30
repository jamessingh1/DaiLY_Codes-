package lab;
import java.util.Scanner;

class rectangle{
    double length;
    double width;

    public rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }

    public rectangle(double l, double b){
      this.length = l;
      this.width = b;
    }

    void areacalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
       this.length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        this.width = sc.nextDouble();
        double result = length * width;
        System.out.println("\n The Area of the rectangle is: " + result);
        
    }
    
}


public class lab01c{
    public static void main(String[] args) {
    rectangle r = new rectangle();
    r.areacalc();    
    }
}