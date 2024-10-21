package Task;

public class Task_15102024_1 {

    public static void main(String[] args){
        // max of 2  nos using ternery opr
        int a=16;
        int b=19;
        int c=10;
        int max=a>b? a:b;
        System.out.println("Max no is "+max);
        // max nos of 3 nos
        int max_3= c >(a>b? a: b) ? c: (a>b? a: b);

        int max3=(a>b)? (a>c ? a :c) :(b>c? b:c);
        System.out.println("max of 3 nos is :"+max_3);
        System.out.println("method 2:  max of 3 nos is :"+max3);

    }
}
