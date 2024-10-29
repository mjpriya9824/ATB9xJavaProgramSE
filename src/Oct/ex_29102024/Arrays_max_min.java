package Oct.ex_29102024;

public class Arrays_max_min {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int max1=get_max(arr);
        System.out.println("Maximum element1: " + max1);



        System.out.println("Maximum element2: " + max);
        System.out.println("Minimum element2: " + min);
    }

    public static int get_max(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }

}
