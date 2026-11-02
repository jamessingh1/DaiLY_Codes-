package main;

import java.util.Scanner;


class Student {
    String name;
    int regdNo;
    String branch;
    String allotedDepartment;

    
    public Student() {
        this.name = "Unknown";
        this.regdNo = 0;
        this.branch = "Unknown";
        this.allotedDepartment = "Unknown";
    }

    
    public Student(String name, int regdNo, String branch, String department) {
        this.name = name;
        this.regdNo = regdNo;
        this.branch = branch;
        this.allotedDepartment = department;
    }
}


class Grades extends Student {
    double internalAssessment;
    double endSem;
    double totalScore; 

    public Grades(String name, int regdNo, String branch, String department, double internal, double endSem) {
        super(name, regdNo, branch, department); // Links to Parent Constructor
        this.internalAssessment = internal;
        this.endSem = endSem;
    }

    public void calcMarks() {
        
        this.totalScore = (this.internalAssessment * 0.40) + (this.endSem * 0.60);
    }

    public String calcGrade() {
        
        if (this.totalScore >= 90) return "O";
        else if (this.totalScore >= 80) return "E";
        else if (this.totalScore >= 60) return "A";
        else if (this.totalScore >= 40) return "B";
        else return "F";
    }
}


class ScholarshipStudent extends Student {
    double scholarshipAmount;

    public ScholarshipStudent(String name, int regdNo, String branch, String department, double amount) {
        super(name, regdNo, branch, department);
        this.scholarshipAmount = amount;
    }
}


public class codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Student[] database = new Student[2];

        
        database[0] = new Grades("Alex", 101, "CSE", "Engineering", 85.0, 92.0);
        database[1] = new ScholarshipStudent("Ryan", 102, "ECE", "Engineering", 5000.0);

        
        for (int i = 0; i < database.length; i++) {
            Student currentStudent = database[i];
            System.out.println("\nChecking processing for ID: " + currentStudent.regdNo);

            
            if (currentStudent instanceof Grades) {
                
                Grades gradeRecord = (Grades) currentStudent; 
                gradeRecord.calcMarks();
                System.out.println(gradeRecord.name + " got the grade: " + gradeRecord.calcGrade());
            } 
            else if (currentStudent instanceof ScholarshipStudent) {
                ScholarshipStudent scholarshipRecord = (ScholarshipStudent) currentStudent;
                System.out.println(scholarshipRecord.name + " is cleared for Scholarship worth: ₹" + scholarshipRecord.scholarshipAmount);
            }
        }
        
        sc.close();
    }
}