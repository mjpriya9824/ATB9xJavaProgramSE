package Oct.ex_171024_if;

import java.util.Scanner;

public class Elseif {

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1:\n");
        int no1=sc.nextInt();
        System.out.println("enter no2:\n");
        int no2=sc.nextInt();
       // System.out.println("enter no3:\n");
        //int no3=sc.nextInt();

        if (no1>no2)
        {
            System.out.println("no 1 is greater than no2");
        } else if (no2>no1) {
            System.out.println("no 2 is greater than no1");


        } else {

            System.out.println("no 1 is equal to no2");
        }
    }
}
