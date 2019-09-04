import java.util.Scanner;
public class SignUp {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        String password;
        String username;
        int password2;
        

        System.out.println("Sign up for nerds.com, please");
        
         System.out.println("Input Username");
        username = scan.nextLine();

       
        

        if (username.equals("person")) {
            System.out.println("Username is Unavailable");
        }
        if (username.equals("admin")) {
            System.out.println("Username is Unavailable");
        }
        if (username.equals("jimbob234")) {
            System.out.println("Username is Unavailable");
        }
        if (username.equals("skater_gurl17")) {
            System.out.println("Username is Unavailable");
        }
        if (username.equals("gary")) {
            System.out.println("Username is Unavailable");
        }

        
        System.out.println("Input Password");
        password = scan.nextLine();
        
        
        if (password.startsWith("a") || password.startsWith("e") || password.startsWith("i") || password.startsWith("o") || password.startsWith("u")) {
        
        } else {
            System.out.println("Password Unavailabe");
        }


        if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("*") || password.contains("&")) {

        } else {
            System.out.println("Password Unavailable");
        }


        if(password.contains(username)){
            System.out.println("Password Unavailable");
        }
        
        password2 = password.length() - 2;
        String password3 = password.substring(password2);

        if(password3.contains("1") || password3.contains("2") || password3.contains("3") || password3.contains("4") || password3.contains("5") || password3.contains("6") || password3.contains("7") || password3.contains("8") || password3.contains("9")){
            System.out.println("Password Unavailable");
        }
 
       

        


        
      
        



    
    }   


}