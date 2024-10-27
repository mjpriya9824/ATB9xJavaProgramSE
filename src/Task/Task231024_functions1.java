package Task;

import java.util.Scanner;

public class Task231024_functions1 {
    public static void main(String[] args) {
        int a,b,sum,diff,mul;
        float div;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=sc.nextInt();
        System.out.println("Enter the value of b:");
        b=sc.nextInt();
        sum=add(a,b);
        diff=sub(a,b);
        mul=mul(a, b);
        div=div(a, b);
        System.out.println("Addition of a+b: "+sum);
        System.out.println("Subtraction of a-b: "+diff);
        System.out.println("Multiplication of a*b: "+mul);
        System.out.println("Division of a/b: "+div);
    }
    public static int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public static int sub(int a, int b)
    {
        int c=a-b;
        return c;
    }
    public static int mul(int a, int b)
    {
        int c=a*b;
        return c;
    }
    public static float div(int a, int b)
    {
        float c= (float) a /b;
        return c;
    }

}
