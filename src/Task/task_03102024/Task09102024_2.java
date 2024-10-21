package Task.task_03102024;

public class Task09102024_2 {
    // CONSTANTS - WHOSE VALUES CANNOT BE CHANGED - CAN BE CREATE BY FINAL KEYWORD
        public static void main(String[] args){
             final int const1=24;
             int var1=24;


             var1=33;  // normal variable can be modified
      //  int const1=25;   gives error when you try to change the value- reassigning will not work
        System.out.printf("var1 : %d",var1);
        System.out.printf("\nconstant : %d",const1);



    }


}
