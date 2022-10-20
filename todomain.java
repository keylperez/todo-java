package TodoListApp;

import java.util.Scanner;

public class todomain {
  
    public static void main(String[] args) {
            login profJoel = new login();
            login profWill = new login();
            login newuser = new login();
            profJoel.setUser("Joel Jayme");
            profJoel.setPass("12345678");
            profJoel.setStat("Developer");
    
    
            profWill.setUser("Willaim P.");
            profWill.setPass("12345678");
            profWill.setStat("Project manager");
         
            System.out.println("Enter Username: ");
            Scanner user = new Scanner(System.in);
            newuser.setUser(user.next());
            System.out.println("Enter Password: ");
            Scanner pass = new Scanner(System.in);
            newuser.setPass(pass.next());
            user.close();
            pass.close();

    }
     public static void authenticate() {
        




     }
}
