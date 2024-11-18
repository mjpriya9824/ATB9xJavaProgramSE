package Nov.ex_08112024.Polymorphism_MethodOverloading;

public class Meth_overriding {
    public static void main(String[] args)
    {
        Husky h1=new Husky();
        h1.bark();

        Dog d2=new Dog();
        d2.bark();

        //dynamic dispatch
        Dog d=new Husky();
        d.bark();



    }


}


class Dog{
    void bark()
    {
        System.out.println("I am dog , I will bark");
    }
    int age=10;
}

class Husky extends Dog{
    @Override
    void bark()
    {
        System.out.println("HUSKY BARK");
        //super.bark();
    }
}