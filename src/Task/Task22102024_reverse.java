package Task;

import java.util.Scanner;

public class Task22102024_reverse {
    public static void main(String[] args)
    {
        int i,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int a=sc.nextInt();
        //int a =560970;
        System.out.println("original no is :"+a);
        while (a>0)
        {
            b=a%10;
            a=a/10;

            System.out.print(b);

        }

    }
}
