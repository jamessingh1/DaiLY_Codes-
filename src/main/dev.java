interface car{
  void drive();
  void gear();
}

class ferrari implements car{
    public void drive(){
      System.out.println("Thoughts Driving...");
    }
    public void gear(){
        System.out.println("Gear Changed!!!");
    }
}


public class dev{
    public static void main(String[] args){
       ferrari c1 = new ferrari();
       c1.drive();
    }
}