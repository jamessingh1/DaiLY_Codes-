package lab;

class student{
    String NAME;
    int AGE;

public student(){
    this.NAME = "Unknown";
    this.AGE = 0;
}

public student(String name, int age){ //PARAMETERIZED CONSTRUCTOR
     this.NAME = name;
     this.AGE = age;
}
public void display(){
    System.out.println("Student Name " + NAME + " and his age is " + AGE);
}
}

public class lab01a {
    public static void main(String[] args){
        student s1 = new student("Virat", 40);
        s1.display();
        student s2 = new student();
        s2.display();
  }
    
}
