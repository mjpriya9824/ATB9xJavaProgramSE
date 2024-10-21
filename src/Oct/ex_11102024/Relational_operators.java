package Oct.ex_11102024;

public class Relational_operators {
    public  static void main(String[] args)
    {
        // return type boolean
        int a=20,b=10;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a<=20);
        // unary operator
        int c=-1; //- is unary operator
        int d=9;
        c=c+1;  //0
        // + operator works differently with different data types - operator overloading
        //ex for strings
        String f="JP",l="M";
        System.out.println(f+l+a+b); //JPM2010  -LEFT TO RIGHT
        System.out.println(f+l+(a+b)); //JPM30
        System.out.println(a+b+f+l); //30JPM





    }

}
