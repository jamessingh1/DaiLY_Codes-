import java.util.Scanner;
class student {
      int regdNo;
      String name;
      String Branch;

    public student(int id, String Name, String BRANCH){
      regdNo = id;
      name = Name;
      Branch = BRANCH;
    }

    void show(){
        System.out.println("Registration No: " + regdNo);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + Branch);
    }

}
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of students details to be entered: ");
        int n = sc.nextInt();
        sc.nextLine();

        student[] arr = new student[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter details: " + (i + 1));

            System.out.println("Enter RegdNo : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the Name : ");
            String Name = sc.nextLine();

            System.out.println("Enter the Branch : ");
            String Branch = sc.nextLine();

            arr[i] = new student(id, Name, Branch);
        }

        for(int i = 0; i < n; i++){
            arr[i].show();
        }

        }

      }


