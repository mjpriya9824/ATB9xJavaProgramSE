package Task;

import java.util.Scanner;

public class Task30102024_pyramid1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("enter no");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for( int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<n;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
