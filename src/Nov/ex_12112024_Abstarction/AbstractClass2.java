package Nov.ex_12112024_Abstarction;

public class AbstractClass2 {
    public static void main(String[] args)
    {

        Child c=new Child();
        c.loan50k();
        c.loan25k();

        }


    }


class Child extends Father{
    @Override
    void loan50k()
    {
        System.out.println("50k loan is given");
    }
}

abstract class Father{
    abstract void loan50k();
    void loan25k()
    {
        System.out.println("25k loan is done");
    }
}
