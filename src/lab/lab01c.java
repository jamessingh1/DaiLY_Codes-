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
        double result = length * width;
        System.out.println("The area of the rectangle according to your dimension: " + result);
    }
    
}

public class lab01c{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the length of the rectangle: ");
    double l = sc.nextDouble();
    System.out.println("Enter the width of the rectangle: ");
    double b = sc.nextDouble();
    rectangle r = new rectangle(l,b);
    r.areacalc();    
    }
}