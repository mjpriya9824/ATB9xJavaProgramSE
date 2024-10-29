
package Oct.ex_29102024;
import java.util.Arrays;
public class Arrays1 {
    public static void main(String[] args) {
        //arr creation1
        int marks[]={90,89,99,79,85,96};
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        System.out.println("marks length: "+marks.length);
        //Arrays.sort(marks);


        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        int index1=Arrays.binarySearch(marks,89);
        System.out.println("\nindex of 89: "+index1);
        System.out.println("arr2 length: "+arr2.length+"\n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
