package Oct.ex_30102024;

public class Arrays_2d {

    public static void main(String[] args) {
        int[][] arr2d={{1,3,3},{4,5,6}};
        for(int i=0;i<arr2d.length;i++)
        {
            for(int j=0;j<arr2d[i].length;j++)
            {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }


    int[][] arr2d1=new int[3][3];
    arr2d1[0][0]=10;
    arr2d1[0][1]=20;
    arr2d1[0][2]=30;
    arr2d1[1][0]=40;
    arr2d1[1][1]=50;
    arr2d1[1][1]=60;
    arr2d1[2][0]=70;
    arr2d1[2][1]=80;
    arr2d1[2][2]=90;

    System.out.println("size of 2d array2: "+arr2d1.length);
    int arr3[][]=new int[2][3];
    System.out.println("size of 2d array3: "+arr3.length);
    System.out.println("column size of arr3: "+arr3[0].length);



    }
}
