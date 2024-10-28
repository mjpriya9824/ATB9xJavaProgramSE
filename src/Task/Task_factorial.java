package Task;

public class Task_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println("method 2: "+fact2(6));

    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int f=n * factorial(n - 1);
            //System.out.println(f);
            return f;
        }
    }
    public static int fact2(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
