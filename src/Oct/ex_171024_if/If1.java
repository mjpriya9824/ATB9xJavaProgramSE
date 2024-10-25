package Oct.ex_171024_if;

import java.util.Scanner;

public class If1 {

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:\n");
        int age=sc.nextInt();
        if (age>18)
        {
            System.out.println("allowed to vote");
        }
        else {
            System.out.println("not allowed to vote");
        }
    }
}
