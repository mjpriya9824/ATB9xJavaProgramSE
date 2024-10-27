package Oct.ex_21102024;

public class Forloop3_evenodd {
    public static void main(String[] args)
    {
        int i;
        int c = 0,o=0;
        for (i=0;i<10;i++)
        {

            if(i>0 && i%2==0) {
                System.out.println("even no " + i);
                c++;
            }
            else if (i>0)
            {
                System.out.println("odd no " + i);
                o++;
            }
            else {
                System.out.println("zero " + i);
            }
        }
        System.out.printf("\neven nos count: %d ,odd nos count: %d",c,o);

    }
}
