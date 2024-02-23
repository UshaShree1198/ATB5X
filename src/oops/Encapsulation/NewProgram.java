package src.oops.Encapsulation;

public class NewProgram {
    public static void main(String[] args) {
        vwoLogin v = new vwoLogin();
        v.setUsername("usha");
        v.setPasssword("shree");
        System.out.println("username is " + v.getUsername());
        System.out.println("password is " + v.getPasssword());

    }

    public static class vwoLogin
    {

        vwoLogin()
        {

        }
        String Username;

        public String getUsername() {
            return Username;
        }

        public void setUsername(String username) {
            Username = username;
        }

        public String getPasssword() {
            return Passsword;
        }

        public void setPasssword(String passsword) {
            Passsword = passsword;
        }

        String Passsword;




    }

}
