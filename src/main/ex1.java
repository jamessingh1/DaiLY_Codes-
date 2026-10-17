interface shape{
    public void area();
}

class circle implements shape{
    public circle(double radius){
        this.radius = r;
    }
}

class rectangle implements shape{
    
}

public class ex1{
    public static void main(String[] args){
       circle cir = new circle();
       rectangle rec = new rectangle();

       cir.area(4);
       rec.area(20,30);
    }
}