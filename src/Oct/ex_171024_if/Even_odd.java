package Oct.ex_171024_if;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  no:");
        int no=sc.nextInt();
        if (no%2==0)
        {
            System.out.println("even no");

        }
        else
        {
            System.out.println("odd no");
        }

    }
}
