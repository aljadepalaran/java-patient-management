package Default;

import coursework.Forms.*;
import coursework.Functions.Display;
import coursework.Functions.Populate;

public class Coursework {

    public static void main(String[] args) {   

        Populate.populateFile();
        Display.displayAppRequests();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
   
    
}

