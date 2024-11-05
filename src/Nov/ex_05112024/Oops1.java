package Nov.ex_05112024;

public class Oops1 {
    public static void main(String[] args)
    {
        StudentsATB s1=new StudentsATB();

        s1.name="priya";
        s1.eat(4);

        StudentsATB s2=new StudentsATB();
        s2.name="jp";
        s2.eat(6);

        System.out.println("s1 address: "+s1);
        System.out.println("s2 address: "+s2);


    }


}
