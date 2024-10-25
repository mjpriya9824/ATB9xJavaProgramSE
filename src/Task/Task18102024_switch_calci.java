package Task;

import java.util.Scanner;

public class Task18102024_switch_calci {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1:");
        int no1= sc.nextInt();
        System.out.println("enter no2:");
        int no2=sc.nextInt();
        System.out.println("enter operator");
        char opr=sc.next().charAt(0);

        switch (opr){
            default -> System.out.println("enter valid operator");
            case '+' -> System.out.println(no1+no2);
            case '-' -> System.out.println(no1-no2);
            case '*' -> System.out.println(no1*no2);
            case '/' -> System.out.println(no1/no2);
            case '%' -> System.out.println(no1%no2);
        }
        sc.close();
    }
}
