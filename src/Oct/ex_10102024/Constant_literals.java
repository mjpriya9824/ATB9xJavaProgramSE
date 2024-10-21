package Oct.ex_10102024;

public class Constant_literals {
    public  static void main(String[] args)
    {
        int a=1,b=2,c=3;
      //  int enum=9; //compile time error
        int String=16; // it works as String is not a keyword but a class
        //esc chars
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char car_r='\r';
        System.out.println("jp"+new_line+"m");
        System.out.println("jp"+tab_line+"m");
        System.out.println("jp"+back_space+"m");
        System.out.println("mjpriya"+"jp"+car_r+"mjp"); //removes everything before char_r


    }

}
