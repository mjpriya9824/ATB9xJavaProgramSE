package Nov.ex_12112024_Interfaces;

public class Interfaces2 {
 public static void main(String[] args)
 {
     C1 c=new C1();
     c.m1();
 }


}



class C1 implements I2
{

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}

interface I2{
    void m1();
    void m2();

}