package Task;

public class Task_primenos {
    public static void main(String[] args) {
        int c ,num = 100;
        boolean flag ;
        for (int j = 1; j <= num; j++) {
           // flag = false;
            c=0;
            for (int i = j; i >=1; i--) {
                if (j % i == 0) {
                    c++;
                }

            }
            if (c==2) {
                System.out.print(j + " ");
            }
//            } else {
//                System.out.println("Not Prime:" + j);
//            }
        }
    }
}
