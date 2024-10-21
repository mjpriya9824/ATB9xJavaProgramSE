package Oct.ex_15102024;

public class Nested_ternery_operator {
    public static void main(String[] args)
    {
       // grade system if score>=90- A
        //BETWEEN 89 TO 80 B
        //BW 79 70 C
        int score=65;
        String grade=(score>=90)? "A": (score>=80)? "B":(score>=70)? "C":(score>=60)? "D":"FAIL";
        System.out.println("Grade is : "+grade);

    }
}
