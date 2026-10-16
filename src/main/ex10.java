interface ExamEvaluation {
    void calculateGrade(double marks);
}

interface AttendanceManagement {
    void checkEligibility(int totalClasses, int attendedClasses);
}

class Faculty implements ExamEvaluation, AttendanceManagement {

    public void calculateGrade(double marks) {
        System.out.println("Student Marks: " + marks);
        if (marks >= 50.0) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    public void checkEligibility(int totalClasses, int attendedClasses) {
        double percentage = ((double) attendedClasses / totalClasses) * 100;
        System.out.println("Attendance Percentage: " + percentage + "%");
        
        if (percentage >= 75.0) {
            System.out.println("Eligibility Status: Eligible for Exams");
        } else {
            System.out.println("Eligibility Status: Not Eligible due to low attendance");
        }
    }
}

public class ex10 {
    public static void main(String[] args) {
        Faculty teacher = new Faculty();

        teacher.calculateGrade(82.5);
        teacher.checkEligibility(40, 32); 

        System.out.println(); 

        teacher.calculateGrade(45.0);
        teacher.checkEligibility(40, 24); 
    }
}
