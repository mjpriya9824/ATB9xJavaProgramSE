package Task;

import java.util.Scanner;

public class Task_17102024_ifelse1_alternate {

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SCORE:\n");
        int no1=sc.nextInt();
        //System.out.println("enter no2:\n");
        // int no2=sc.nextInt();
        // System.out.println("enter no3:\n");
        //int no3=sc.nextInt();
        char grade;
        if (no1>=90 && no1<=100)
        {
            grade='A';
        }
        else if (no1>=80 && no1<90)
        {
            grade='B';
        }

        else if (no1>=70 && no1<80)
        {
            grade='C';
        }
        else if (no1>=60 && no1<70)
        {
            grade='D';
        }
        else if (no1<0 || no1>100)
        {
            grade='O';
            System.out.println("enter valid score");
        }
        else
        {
            grade='F';
        }
        System.out.println("grade is : "+grade);
    }
}
