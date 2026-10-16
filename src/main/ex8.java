interface PaymentProcessor {
    void processPayment(double amount);
}

class OnlinePayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Online Payment...");
        System.out.println("Status: Success! Received ₹" + amount);
    }
}

class CashPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Cash Payment at Counter...");
        System.out.println("Status: Success! Deposited ₹" + amount);
    }
}

class InsurancePayment implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Insurance Claim...");
        System.out.println("Status: Success! Covered ₹" + amount);
    }
}

public class ex8 {
    public static void main(String[] args) {

        OnlinePayment online = new OnlinePayment();
        CashPayment cash = new CashPayment();
        InsurancePayment insurance = new InsurancePayment();

        online.processPayment(4500.50);
        System.out.println(); 
        
        cash.processPayment(1200.00);
        System.out.println();
        
        insurance.processPayment(75000.00);
    }
}
