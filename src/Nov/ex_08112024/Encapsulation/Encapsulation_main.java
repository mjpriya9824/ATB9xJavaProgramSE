package Nov.ex_08112024.Encapsulation;

public class Encapsulation_main {

    public static void main(String[] args) {


        Login l = new Login("priya", "priyapwd");
     /*   System.out.println(l.password);
        l.password="new_pwd";
        System.out.println(l.password); */  //privaate
       //String pwd=l.printpwd();
        System.out.println(l.printpwd(true));
        System.out.println(l.printpwd(false));
     String pwd2=   l.getPassword();
     //String pwd3=l.password;


       // l.setPassword("set");


    }

}

class Login{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {


        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }


    public Login(String username,String password)
    {
        System.out.println("Login");
        this.password=password;
        this.username=username;
    }

    public String printpwd(Boolean isAuth)
    {
        if (isAuth)  {
        return password;
    }
       else
        {
            return null;
        }
    }


}
