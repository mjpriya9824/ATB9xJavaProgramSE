package Oct.ex_23102024;

public class Functions1 {
    public static void main(String[] args)
    {
        sample();
        int a=10,b=20,c;
        c=add(a,b);
        System.out.println("add a+b: "+c);
        System.out.println("Math max of a,b: "+Math.max(a,b));
        String msg=sample3();
        System.out.println("with RT WO PS"+msg);
        sample2(a,b);
    }
    public static int add(int a,int b) //w rt w ps
    {
        int c=a+b;
        return c;
    }
    public static void sample() //without return type and and without parameters
    {
        System.out.println("hello function");
    }
    public static String sample3() //without return type and and with parameters
    {
        return "msg hell0";
    }
    public static void sample2(int a, int b) //without return type and and with parameters
    {
        int c;
        if (a>b)
        {
            c=b;
        }
        else {
            c=a;
        }
        System.out.println("Min of a,b: "+c);
    }

}
