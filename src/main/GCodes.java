package main;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int regdNo;
    String branch;
    String allotedDepartment;

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
        super(name, regdNo, branch, department);
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

class StudentDatabase<T extends Student> {
    private List<T> students = new ArrayList<>();

    public void addStudent(T student) {
        students.add(student);
    }

    public List<T> getAllStudents() {
        return students;
    }
}

// --- 2. MULTITHREADING: Processes individual students concurrently ---
class StudentProcessor implements Runnable {
    private Student student;

    public StudentProcessor(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        // Code executed inside the separate thread
        System.out.println("[" + Thread.currentThread().getName() + "] Processing ID: " + student.regdNo);

        if (student instanceof Grades) {
            Grades gradeRecord = (Grades) student;
            gradeRecord.calcMarks();
            System.out.println("-> " + gradeRecord.name + " got the grade: " + gradeRecord.calcGrade());
        } 
        else if (student instanceof ScholarshipStudent) {
            ScholarshipStudent scholarshipRecord = (ScholarshipStudent) student;
            System.out.println("-> " + scholarshipRecord.name + " is cleared for Scholarship: ₹" + scholarshipRecord.scholarshipAmount);
        }
    }
}

// --- Main Class ---
public class GCodes {
    public static void main(String[] args) {

        // Using Generic Class to store students safely
        StudentDatabase<Student> db = new StudentDatabase<>();
        db.addStudent(new Grades("Alex", 101, "CSE", "Engineering", 85.0, 92.0));
        db.addStudent(new ScholarshipStudent("Ryan", 102, "ECE", "Engineering", 5000.0));

        System.out.println("=== Starting Multithreaded Processing ===");

        // Process each student in a new thread concurrently
        for (Student s : db.getAllStudents()) {
            Thread thread = new Thread(new StudentProcessor(s));
            thread.start(); // Spawns and executes the thread
        }
    }
}

