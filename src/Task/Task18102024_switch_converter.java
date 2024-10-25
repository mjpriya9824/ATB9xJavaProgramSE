package Task;

import java.util.Scanner;

public class Task18102024_switch_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double solution;
        System.out.println("enter value");
        double value = sc.nextDouble();
        System.out.println("enter the choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                solution = value * 0.62137;
                System.out.println("From KM to miles: " + solution);
                break;
            case 2:
                solution = (value - 32) * 5 / 9;
                System.out.println("Fahrenheit to Celcius:" + solution);
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
        sc.close();
    }

}

