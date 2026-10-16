interface StudentDetails {
    void acceptDetails(String n, int r, double m);
    void displayDetails();
}

class Student implements StudentDetails {

    String name;
    int registerNumber;
    double marks;

    public void acceptDetails(String n, int r, double m) {
        name = n;
        registerNumber = r;
        marks = m;
    }

    public void displayDetails() {
        System.out.println("--- STUDENT PROFILE ---");
        System.out.println("Student Name   : " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Total Marks    : " + marks);
    }
}

public class ex3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.acceptDetails("Ankit Singh", 102345, 94.5);
        
        s1.displayDetails();
    }
}
