package OOPs;
//import java.util.Scanner;
class Student{
    int regdNo;
    String Name;
    double internalmarks;
    double endsemmarks;

    public Student(int id, String StudentName){
        regdNo = id;
        Name = StudentName;
        internalmarks = 0.0;
        endsemmarks = 0.0;
    }

    public void marks(double internal, double endsem){
           internalmarks = internal;
           endsemmarks = endsem;
    }

    public String calculategrade(){
           double totalscore = (internalmarks * 0.50 + endsemmarks * 0.50);
           if(totalscore >= 90)
                return "O";
           else if(totalscore >= 80)
                return "E";
           else if(totalscore >= 70)
                return "A";
           else if(totalscore >= 60)
                return "B";
           else if(totalscore >= 50)
                return "C";
           else if(totalscore >= 40)
                return "D";
            else
                return "Fr";
           }
    }


public class demo {
    public static void main(String[] args){
        Student s1 = new Student(101, "Rahul Kr.");
        Student s2 = new Student(102,"Rohit Raj");
        Student s3 = new Student(103, "Priya");
        s1.marks(45.0,89.0);
        s2.marks(50, 60);
        s3.marks(20, 92);
        System.out.println(s1.Name + ":" + s1.calculategrade());
        System.out.println(s2.Name + ":" + s1.regdNo + ":" + s2.calculategrade());



    }


    
}
