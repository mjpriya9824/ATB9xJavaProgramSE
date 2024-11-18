package Nov.ex_12112024_SuperKeyWord;

import java.security.PublicKey;

public class SuperKeyword {
    public static void main(String[] args)
    {

        Car c=new Car();
    }



}

class Car extends Vehicle{
    private int maxspeed=280;

    public Car() {
        super(10);
        System.out.println("DC CAR");
        System.out.println(this.maxspeed);
        System.out.println(super.maxspeed);
        super.display(); // parent method
        this.display(); //current method
    }

    @Override
    void display()
    {
        System.out.println("child display func");
    }



}


class Vehicle
{
 public int maxspeed=150;
    public Vehicle() {
        System.out.println("DC Vehicle");

    }

    public Vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void display()
    {
        System.out.println("Parent display method");
    }

}
