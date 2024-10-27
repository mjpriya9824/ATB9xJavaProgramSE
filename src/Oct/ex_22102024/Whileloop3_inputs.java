package Oct.ex_22102024;

import java.util.Scanner;

public class Whileloop3_inputs {
    public static void main(String[] args) {
        int age, age2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age2:");
        age2 = sc.nextInt();
        for (; age2 > 0; age2--) {
            System.out.print(age2 + " ");
        }
        System.out.println("\ninput through args, while loop");
        age = Integer.parseInt(args[0]);

        while (age > 0) {
            System.out.print(age + " ");
            age--;

        }


    }
}
