abstract class payments{
    int product,transportation;

    payments(int S_price,int C_price){
        product = S_price;
        transportation = C_price;
    }

    int calculate(){
        int discount = (product * 10)/100;
        int total = (product - discount) + transportation;
        return total;
    }

    abstract void pay();
}

class Paynow extends payments{
    Paynow(int S_price,int C_price){
        super(S_price,C_price);
    }
    void pay(){
        int amount = calculate();
        System.out.println("Paid amount : " + amount);
    }
}
public class tkl {
    public static void main(String[] args) {
        payments p1 = new Paynow(2899,40);
        p1.pay();
    }
}
