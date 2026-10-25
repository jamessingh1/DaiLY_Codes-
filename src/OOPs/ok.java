package OOPs;
import java.util.Scanner;

class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(){
        this.accountNumber = 000;
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    public BankAccount(int acno, String acname, double balance){
        this.accountNumber = acno;
        this.accountHolderName = acname;
        this.balance = balance;
    }

    public void setAccountNumber(){
       // this.accountNumber = accountNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter AccountNumber: ");
       this.accountNumber = sc.nextInt();
    }

    
    public void setbalance(int amount){
        if (amount > 0){
            System.out.println("Account Balance is Valid");
        }else {
            System.out.println("Account Balance is invalid");
        }
        this.balance = amount;
    }

    public int getaccountnumber(){
        return this.accountNumber;
    }

    public String getaccountname(){
        return this.accountHolderName;
    }

    public double getbalance(){
        return this.balance;
    }

    public void deposit(){
        this.balance = balance + 100.99;
        System.out.println("Current A/C Balance: " + balance);
    }

    public void withdraw(){
        if(this.balance > 0){
        this.balance = balance - 99;
        System.out.println("Current A/C Balance: " + balance);
    }
 }
}


public class ok {
    public static void main(String args[]){
         
        BankAccount C1 = new BankAccount();
       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter A/C No: " );
     C1.setAccountNumber();  
     System.out.println("A/c Number Saved: "+C1.getaccountnumber());
           
        
    }
}
