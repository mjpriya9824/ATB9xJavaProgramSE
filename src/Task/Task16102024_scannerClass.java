package Task;

import java.util.Scanner;

public class Task16102024_scannerClass {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter name\n");
        String name=sc.nextLine();
        System.out.println("\nenter age\n");
        int age=sc.nextInt();
        System.out.println("\nenter Salary\n");
        double salary= sc.nextDouble();

        System.out.printf("name , age, salary : %s \t %d \t %f",name,age, salary);

    }

}
