// Encapsulation (getter / setter)

package OOPs;

import java.util.Scanner;

class password{
    private int LockerPassword;

    
    public void setpassword(int password){
    //Scanner sc = new Scanner(System.in); 
    //System.out.printf("Enter your choice passkey: \n", LockerPassword);
    //LockerPassword = sc.nextInt();
        if(password >= 1000 && password <= 9999){
            this.LockerPassword = password;
            System.out.println("Password is validated and used for future reference");
        }else{
            System.out.println("Entered an invalid password type! \n");
        }
    }

    public int getpassword(){
       // this.LockerPassword = password;
        return LockerPassword;
    }   
}

public class encap{
    public static void main(String[] args){
       password passkey = new password();
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your Desired Passkey: ");
       int input = sc.nextInt();
       passkey.setpassword(input);

       passkey.getpassword();
       System.out.println("Hey your Password that you have set: " + passkey.getpassword());
    }
}

