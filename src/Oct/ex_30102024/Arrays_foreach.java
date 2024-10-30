
package Oct.ex_30102024;
import java.util.Arrays;

public class Arrays_foreach {
    public static void main(String[] args) {
        //arr creation1

        int[] arr2 = new int[5];
        arr2[0] = 90;
        arr2[1] = 200;
        arr2[2] = 30;
        arr2[3] = 4;
        arr2[4] = 56;
        Arrays.sort(arr2);
        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
               System.out.println();
        String a_arr[]={"Lionel","Andres","Messi"};

        for (String  name:a_arr)
        {
            System.out.print(name+" ");
        }
    }
}
