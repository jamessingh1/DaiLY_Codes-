package G&M;

public class generic {
    package main;

import java.util.ArrayList;
import java.util.List;

// Base Class
class Student {
    String name;
    int regdNo;
    String branch;

    public Student(String name, int regdNo, String branch) {
        this.name = name;
        this.regdNo = regdNo;
        this.branch = branch;
    }

    public void displayDetails() {
        System.out.println("ID: " + regdNo + " | Name: " + name + " | Branch: " + branch);
    }
}

// Subclass 1: Grades
class Grades extends Student {
    double totalScore;

    public Grades(String name, int regdNo, String branch, double score) {
        super(name, regdNo, branch);
        this.totalScore = score;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + regdNo + " | Name: " + name + " | Score: " + totalScore);
    }
}

// Subclass 2: Scholarship
class ScholarshipStudent extends Student {
    double scholarshipAmount;

    public ScholarshipStudent(String name, int regdNo, String branch, double amount) {
        super(name, regdNo, branch);
        this.scholarshipAmount = amount;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + regdNo + " | Name: " + name + " | Scholarship: ₹" + scholarshipAmount);
    }
}

// Generic Database Class bounded to Student types
class StudentDatabase<T extends Student> {
    private List<T> studentList = new ArrayList<>();

    public void addStudent(T student) {
        studentList.add(student);
    }

    public void printAllRecords() {
        for (T s : studentList) {
            s.displayDetails();
        }
    }
}

// Main Class
public class GenericsDemo {
    public static void main(String[] args) {
        // Generic database holding general Students or its subclasses
        StudentDatabase<Student> db = new StudentDatabase<>();

        db.addStudent(new Student("Sophia", 201, "CSE"));
        db.addStudent(new Grades("Alex", 202, "ECE", 88.5));
        db.addStudent(new ScholarshipStudent("Ryan", 203, "EE", 7500.0));

        System.out.println("=== Student Database Records ===");
        db.printAllRecords();
    }
}
    
}
