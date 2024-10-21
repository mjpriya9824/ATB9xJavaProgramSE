package Oct.ex_16102024;

import java.util.Scanner;

public class Scanner_class {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter age:\n");
        int age=sc.nextInt();
        System.out.printf("age is %d\n",age);

        sc.close();

    }
}
