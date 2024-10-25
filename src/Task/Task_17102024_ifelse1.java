package Task;

import java.util.Scanner;

public class Task_17102024_ifelse1 {

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SCORE:\n");
        int no1=sc.nextInt();
        //System.out.println("enter no2:\n");
        // int no2=sc.nextInt();
        // System.out.println("enter no3:\n");
        //int no3=sc.nextInt();

        if (no1>=90 && no1<=100)
        {
            System.out.println("A grade");
        }
        else if (no1>=80 && no1<90)
        {
            System.out.println("B grade");
        }

        else if (no1>=70 && no1<80)
        {
            System.out.println("C grade");
        }
        else if (no1>=60 && no1<70)
        {
            System.out.println("D grade");
        }
        else if (no1>=0 && no1<60)
        {
            System.out.println("F");
        }

    }
}
