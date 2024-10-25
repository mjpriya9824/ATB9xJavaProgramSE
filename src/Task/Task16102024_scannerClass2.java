package Task;

import java.util.Scanner;

public class Task16102024_scannerClass2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number 1\n");

        int a=sc.nextInt();
        System.out.println("\nenter number 2");

        int b=sc.nextInt();
        int max = a>b? a:b;

        System.out.printf("Max of 2 nos is %d",max);
    sc.close();
    }

}
