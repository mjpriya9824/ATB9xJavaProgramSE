package Nov.ex_06112024;

import java.util.Scanner;

public class OOPS_Parameterized_Constructor {
    public static void main(String[] args) {
        Car2 c2 =new Car2("tesla","2020");
        System.out.println(c2.model1);
        System.out.println(c2.name1);
        c2.display();
        Scanner sc=new Scanner(System.in);

        String name_m=sc.nextLine();
        String model_m=sc.nextLine();

        Car2 c3=new Car2(name_m,model_m);
        System.out.println(c3.model1);
        System.out.println(c3.name1);
        c3.display();

        Car2 c1=new Car2();
        System.out.println("c1 .name and model of def constr: "+c1.name1+" "+c1.model1);

    }
    }

    class Car2
    {
        String model1,name1;
        Car2(String model,String name)
        {
            System.out.println("name and model: "+model+" "+name);
            this.model1=model;
            this.name1=name;
        }
        void display()
        {
            System.out.println("car details: "+this.model1+" "+this.name1);
        }

        Car2()
        {
            model1="bmw";
            name1="priya";
        }

    }




    ////

