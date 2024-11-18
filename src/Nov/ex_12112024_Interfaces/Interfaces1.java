package Nov.ex_12112024_Interfaces;

public class Interfaces1 {
}


abstract class ABC
{
    ABC()
    {

    }
    abstract void m1();
    void m2()
    {
        System.out.println("m2");
    }
}


interface In{
    void m1();
    void m2();
    default void m3()
    {
        System.out.println("m3");
    }
    default void m4()
    {
        System.out.println("m4");
    }

}
