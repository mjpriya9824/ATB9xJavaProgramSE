package Task;

import java.util.Scanner;

public class Task_fibbanocci {
    public static void main(String[] args)
    {
        int num,a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        num=sc.nextInt();
        for (int i=0;i<num;i++)
        {
            if (i==0 || i==1) {
                System.out.print(i + " ");
            }
            else {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
    }
}
