interface Person {
    void displayName();
}

interface EmployeeDetails extends Person {
    void displaySalary();
}

class Staff implements EmployeeDetails {
    String name;
    double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayName() {
        System.out.println("Employee Name: " + name);
    }

    public void displaySalary() {
        System.out.println("Monthly Salary: ₹" + salary);
    }
}

public class ex6 {
    public static void main(String[] args) {
        Staff emp = new Staff("Ankit Singh", 65000.00);
  
        emp.displayName();
        emp.displaySalary();
    }
}
