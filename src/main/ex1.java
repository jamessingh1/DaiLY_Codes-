package main;
class student {
    String name;
    int age;

student(String name, int age){
  this.name = name;
  this.age = age;
}

void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}

public class ex1{
    public static void main(String[] args){
        student s1 = new student("Akki",23);
        s1.display();
    }
}