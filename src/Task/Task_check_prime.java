package Task;

import java.util.Scanner;

public class Task_check_prime {
    public static void main(String[] args) {
        int c, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        num = sc.nextInt();
        // flag = false;
        c = 0;

        for (int i = num; i >= 1; i--) {
            //System.out.println(num%i);
            if (num % i == 0) {

                c++;
            }
            //System.out.println(c);
        }
        if (c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime:");
        }
    }
}
