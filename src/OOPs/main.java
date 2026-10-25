package OOPs;

class myexception extends Exception{
    public myexception(){
      super();
}
}


class compute{
    public void drive(){
        System.out.println("Yaa Car is driving....");
    }
}
public class main {
    public static void main(String[] args){
        
        int x = 0;
        int y = 18;
        int arr[] = new int[4];

        try{
           y = y/x;
           if(y == 0){
            throw new ArithmeticException();
           }
        }
        catch(myexception e){
            System.out.println("Hey there is a runtime exception " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong..."+e);
        }

        compute audi = new compute();
        audi.drive();

    }
    
}
