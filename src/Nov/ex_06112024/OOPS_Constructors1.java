package Nov.ex_06112024;

public class OOPS_Constructors1 {
    public static void main(String[] args)
    {
        Car c1=new Car();
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

        Car c2=new Car();
        c2.model="tesla";
        c2.year=2020;
        c2.name="Elon musk";
        System.out.println("c2: ");
        System.out.println(c2.model);
        System.out.println(c2.name);
        System.out.println(c2.year);




    }


}
