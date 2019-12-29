package Default;

import coursework.Forms.Login;
import coursework.Users.*;

public class Coursework {


    public static void main(String[] args) {   
        
        //TestClass.populateRandom();
        //TestClass.populateAdmin();
        //FileIO.displayArray();
        System.out.println(Functions.generateID('A'));
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
    
   
}

