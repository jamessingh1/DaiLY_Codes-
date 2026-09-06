package Demo;

import java.util.Scanner;

public class demo02{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int data;

        System.out.print("Enter no. of your choice: " );
        data = sc.nextInt();

        switch(data){
            case 1:
                System.out.println("Mon");
                  break;
            case 2:
                System.out.println("Tue");
                 break;
            case 3:
                System.out.println("Wed");
                 break;
            case 4:
                System.out.println("Thur");
                 break;
            case 5:
                System.out.println("Fri");
                  break;
            case 6:
                System.out.println("Deloitte");
                  break;
            case 7:
                System.out.println("Backley");
                  break;
            default:
                System.out.println("Enter a valid Number duffer");

        }
    }
        
    }
