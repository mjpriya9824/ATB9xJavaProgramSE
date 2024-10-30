package Task;

import java.util.Scanner;

public class Task30102024_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n;
        System.out.println("enter no");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (int k = n-1; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 1; i < n; i++) {
            for (int k = 0; k <i; k++) {
                System.out.print(" ");
            }
            for (j = n-1; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
