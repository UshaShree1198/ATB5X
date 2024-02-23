package src.oops.Encapsulation;

public class Prog2 {
    public static void main(String[] args) {

        vwoLogin v = new vwoLogin("admin", "admin");
     boolean check =  v.isLoggedIn("admin", "admin");
        System.out.println(check);
        System.out.println("password  is " + v.getPasssword());

    }


    public static class vwoLogin {
        private String Username;

        public String getPasssword() {
            return Passsword;
        }

        private String Passsword;


        public vwoLogin(String username, String password) {
            this.Username = username;
            this.Passsword = password;
        }

         boolean isLoggedIn(String username, String passsword)
         {
             if (this.Username.equalsIgnoreCase(username) && this.Passsword.equalsIgnoreCase(passsword))
             {
                 System.out.println("LOGGED IN");
             }
             else
                 System.out.println("INCORRECT");
                 return false;
             }

         }
}