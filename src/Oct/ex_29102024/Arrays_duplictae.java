package Oct.ex_29102024;

import java.util.Scanner;

public class Arrays_duplictae {
    public static void main(String[] args)
    {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter the no:"+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (int j=0;j<a.length;j++)
        {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        func_duplicate(a);


    }
    public static void func_duplicate(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    System.out.println("duplicate found " + arr[i]);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {

            System.out.println("No duplicates found");
        }
    }
 }

