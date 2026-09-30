package lab;
class car{
    String brand;
    double price;

    public car(String brand,int price){
        this.brand = brand;
        this.price = price;
    }

    void carvalue(){
        System.out.println("Car Brand Name: " + brand);
        System.out.println("Price: " + " $ " + price);
    }
}
public class lab01b {
    public static void main(String[] args) {
        car c1 = new car("BMW", 278991);
        c1.carvalue();
        car c2 = new car("Maruti Suzuki",54000);
        c2.carvalue();
    }
}
