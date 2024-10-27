package Task;

import java.util.Scanner;

public class Task22102024_pal_charat {
    public static void main(String[] args) {
        //String str="Hello";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char ch[] = new char[str.length()];
        int j = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            ch[j] = str.charAt(i);
            //System.out.print(ch[i]);
            j++;
        }
        String rev = new String(ch);
        System.out.println();
        System.out.println("reverse of given string: " + rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }

    }
}
