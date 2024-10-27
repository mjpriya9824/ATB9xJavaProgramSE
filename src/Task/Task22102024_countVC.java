package Task;

import java.util.Scanner;

public class Task22102024_countVC {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s= sc.nextLine();
       // String s="Hello World";
        s=s.toLowerCase();
        int v=0,c=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                v++;
            }
            else if (s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
    }
}
