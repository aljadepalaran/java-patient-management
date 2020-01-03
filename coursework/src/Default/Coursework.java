package Default;
import coursework.Forms.*;
import coursework.Functions.*;
import coursework.Users.*;
public class Coursework {


    public static void main(String[] args) {   

        Display.displayUsers();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
   
    
}

