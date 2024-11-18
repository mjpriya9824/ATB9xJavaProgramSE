package Nov.ex_12112024_Interfaces;

public class Interfaces_MultipleInheritance {


}

class Child implements Mother,Father
{

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void same() {

    }
}

interface Mother{
    void m1();
    void m2();
    void same();
}
interface Father{
    void f1();
    void f2();
    void same();
}