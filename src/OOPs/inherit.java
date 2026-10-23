package OOPs;

abstract class A{
    final void drive(){
        System.out.println("Driving Mode on......");
    }
}

class B extends A {
}

public class inherit{
    public static void main(String[] args){
        B obj1 = new B();
        obj1.drive();

    }
}