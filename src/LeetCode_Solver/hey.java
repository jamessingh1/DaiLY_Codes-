package LeetCode_Solver;

import java.util.Scanner;

public class hey {

    public static void printprimes(int n) {

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        printprimes(n);

        sc.close();
    }
}