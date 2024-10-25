package Oct.ex_18102024;

import java.util.Scanner;

public class Switch_multiplecases {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int day1=sc.nextInt();
        switch (day1){
            default:
                System.out.println("not a valid entry");
                break;

            case 1,3,7:
               // dayname="Mon";
                System.out.println("odd nos");
                break;
            case 2,4,6:
                // dayname="Mon";
                System.out.println("even nos");
                break;
            // default:
             //   System.out.println("not a valid entry");
              //  break;
        }
        // switch 2 ->
        System.out.println("enter the day from 1-7 :");
        int day=sc.nextInt();
        switch (day) {
            default -> System.out.println("not a valid entry");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
        }



        }
}
