abstract class logic{
    // constructor //
    int a, b;

    logic(int x, int y){
        a = x;
        b = y;
    }
    abstract int calculate();
}

class addition extends logic{
    addition(int x, int y){
        super(x,y);
    }
    int calculate(){
        return a+b;
    }
}
  public class logai  {
    public static void main(String[] args) {
       logic obj = new addition(10,12);
        System.out.println(obj.calculate());
    }
}
