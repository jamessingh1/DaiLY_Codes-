package OOPs;
class car{
    public void drive() {
            System.out.println("Yaa Driving.....");
        }
}
public class except {
    public static void main(String[] args){
        int a = 8;
        int b = 0;

        try{
            b = 78/a;
            if(b==0){
                throw new ArithmeticException(); //
            }
        }
        catch(ArithmeticException e){
            System.out.printf("Exception Error! ", e);
        }
         
        System.out.println("Hey the value of B is now: " + b);
        car c1 = new car();
        c1.drive();
    }
}
