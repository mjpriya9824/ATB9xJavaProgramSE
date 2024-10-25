package Oct.ex_18102024;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day from 1-7 :");
        int day=sc.nextInt();
        switch (day){
            default:
                System.out.println("not a valid entry");
                break;

            case 1:
               // dayname="Mon";
                System.out.println("Monday");
                break;
            case 2:
                // dayname="Mon";
                System.out.println("Tuesday");
                break;
            case 3:
                // dayname="Mon";
                System.out.println("Wedneday");
                break;

            case 4:
                // dayname="Mon";
                System.out.println("Thursday");
                break;
            case 5:
                // dayname="Mon";
                System.out.println("Friday");
                break;
            case 6:
                // dayname="Mon";
                System.out.println("Saturday");
                break;

            case 7:

                System.out.println("Sunday");
                break;
           // default:
             //   System.out.println("not a valid entry");
              //  break;
        }


    }
}
