package Task;

import java.util.Scanner;

public class Task_17102024_triangle {

    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side1:\n");
        double no1=sc.nextDouble();
        System.out.println("enter side2:\n");
         double no2=sc.nextDouble();
        System.out.println("enter side3:\n");
        double no3=sc.nextDouble();

        if (no1==no2 && no1==no3 && no2==no3)
        {
            System.out.println("equilateral triangle");
        }
        else if (no1==no2 || no1==no3 || no2==no3)
        {
            System.out.println("Isosceles triangle");
        }

        else
        {
            System.out.println("Scalene triangle");
        }
    }
}
