package Nov.ex_07112024.SI1;

public class SingleInheritance extends Father {
    public static void main(String[] args)
    {
        Son s1=new Son();
        s1.bhk3();
        s1.bhk2();   //behaviour
        System.out.println(s1.gold);  //attribute
        SingleInheritance si1=new SingleInheritance();

        System.out.println("gold: "+si1.gold);

    }
}



