package Oct.ex_21102024;

public class Forloop_break_contiue {
    public static void main(String[] args)
    {
        int i,j;
        for (i=0;i<10;i++)
        {
            if(i==5){
                break;
            }
            System.out.print(i+" ");

        }
        System.out.println("\ncontiue ex for if i=5");
        for (j=0;j<10;j++)
        {
            if(j==5){
                continue;
            }

            System.out.print(j+" ");
        }
        System.out.println("\neven odd nos case with continue");
        int k=20;
        int a=k;
        for(;k>0;k--)
        {
            if(k%2==0)
            {
                //if(k>=a-1 b b  )
               // {
                 //   System.out.print(k+" ");
              //  } /
                System.out.println(k+" even no");

                continue;
            }
//            if(k>=a-1)
//            {
//                System.out.println("\nodd nos:");
//            }
            System.out.println(k+" odd no");
        }


    }
}
