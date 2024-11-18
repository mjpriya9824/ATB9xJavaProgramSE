package Task.NovTasks.task_08112024;

public class String_override {
    public static void main(String[] args)
    {
        ATB_Student s1=new ATB_Student(90,"jp",'A');
        ATB_Student s2=new ATB_Student(65,"div",'A');
        ATB_Student s3=new ATB_Student(71,"Jeev",'A');
        ATB_Student s4=new ATB_Student(72,"Harsh",'A');

        ATB_Student[] students={s1,s2,s3,s4};

        for (ATB_Student a:students)
        {
            System.out.println(a);
        }
        System.out.println(s1.toString1());




    }

}

class ATB_Student{

    int id;
    String name;
    char grade;

    public ATB_Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString()
    {
        return id+":"+name+":"+grade;
    }

    public String toString1()
    {
        return id+"-"+name+"-"+grade;
    }

}
