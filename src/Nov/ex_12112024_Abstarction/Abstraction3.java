package Nov.ex_12112024_Abstarction;

public class Abstraction3 {

    public static void main(String[] args)

    {
        Vehicle v=new Vehicle();
        v.drive();
        Tesla t=new Tesla();
        t.drive();

    }


}
class Vehicle extends Engine{
    @Override
    void startEngine() {
        System.out.println("start the car");
    }

    @Override
    void stopEngine() {
        System.out.println("stop the car");
    }
    void drive()
    {
        startEngine();
        stopEngine();
    }

}

class Tesla extends Engine{
    @Override
    void startEngine() {
        System.out.println("start the electric engine car");
    }

    @Override
    void stopEngine() {
        System.out.println("stop the electric engine car");
    }
    void drive()
    {
        startEngine();
        stopEngine();
    }

}



abstract class Engine
{
 abstract void startEngine();
  abstract  void stopEngine();
}