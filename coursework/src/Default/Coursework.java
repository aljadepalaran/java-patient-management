package Default;

import coursework.Forms.*;
import coursework.Functions.Display;

public class Coursework {

    public static void main(String[] args) {   

        
        Display.displayUsers();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
   
    
}

