package Nov.ex_08112024.Polymorphism_MethOverriding;

public class MethOverloading1 {
    public static void main(String[] args)
    {
        MathOprs m1=new MathOprs();
      int add1=m1.Add(4,8);
        System.out.println(add1+" ; int add1");
      double add2=m1.Add(4.6,8.8);
        System.out.println(add2 +": float :  float1 add2");


    }

}


class MathOprs
{
    int Add(int a,int b)
    {
        return a+b;
    }

    double Add(double a,double b)
    {
        return a+b;
    }

}
