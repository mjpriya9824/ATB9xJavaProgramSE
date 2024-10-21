package Oct.ex_16102024;

public class Arguments_console {


    public static void main(String[] args)
    {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        int c= Integer.parseInt(args[2]);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("a,b,c %d %d %d \n",a,b,c);

        System.out.println(a>18? "can vote":"cannot vote");


    }
}
