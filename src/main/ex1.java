interface Shape {
    void calculateArea(); 
}

class Circle implements Shape {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public void calculateArea() {
        double result = 3.14 * radius * radius;
        System.out.println("The area of the Circle is: " + result);
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void calculateArea() {
        double result = length * width;
        System.out.println("The area of the Rectangle is: " + result);
    }
}

public class ex1 {
    public static void main(String[] args) {
        
        Circle myCircle = new Circle(5.0);
        myCircle.calculateArea(); 
        
        Rectangle myRectangle = new Rectangle(4.0, 6.0);
        myRectangle.calculateArea();
}
}
