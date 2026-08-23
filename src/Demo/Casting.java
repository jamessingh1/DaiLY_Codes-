package Demo;

public class Casting {

    // Conversion & Casting

    public static void main(String[] args){

        byte c = 100;

    
    int a = 789;
    byte b = (byte) a; //data specified explicitly

// Casting is required in OOPs Concept
    float f = 5.6f;
    int x = (int)f;

    // Type Promotion

    byte y = 80;
    byte z = 10;

    int result = y * z;

    //System.out.print(result + " ");
   // System.out.print(x + " ");
   // System.out.print(b + " ");


    //Post and Pre increment

    int alpha = 786;
    int ans = alpha++;
    int output = ++alpha;

    //System.out.println(alpha);// to check post increment
    //System.out.println(output); // to check pre increment

    //Comparison Operator

    int j = 789;
    int k = 587;
    if(j==k){
        System.out.println("true");

    }

    // Condition Statement

    int s = 7;
    int q = 5;
    int r = 9;
    int t = 5;

    boolean soln = s > q || r < t;
    System.out.println(soln);

  }  

    
}
