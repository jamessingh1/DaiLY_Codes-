interface Employee {
    double getSalary();
    void displayDetails();
}

class Manager implements Employee {
    String name;
    double baseSalary;
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double getSalary() {
        return baseSalary + bonus;
    }

    public void displayDetails() {
        System.out.println("Manager Name : " + name);
        System.out.println("Total Salary : $" + getSalary());
    }
}

public class ex4 {
    public static void main(String[] args) {
        Manager mgr = new Manager("Ankit Kumar", 75000.0, 15000.0);
        mgr.displayDetails();
    }
}
