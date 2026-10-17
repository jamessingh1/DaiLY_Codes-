class calc{
    int num1;
    int num2;
    //int result;

    public void add(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        int sum = num1 + num2;
        System.out.println("Addition Values are: " + sum);
    }

    public void multiply(int num1, int num2){
        int value = num1 * num2;
        System.out.println("Multiplication Value: " + value);
    }
}

public class calculator{
    public static void main(String[] args){
        calc a = new calc();
        try{
            a.add(20,-90);
        System.out.println();
        } catch(ArithmeticException e){
            System.out.println("Error While adding! only positve integer value is possible");
        }                       
    }
}