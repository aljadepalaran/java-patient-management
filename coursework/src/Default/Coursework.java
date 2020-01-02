package Default;
import coursework.Forms.Login;
import coursework.Functions.*;
import coursework.Users.User;
public class Coursework {


    public static void main(String[] args) {   
        
        //PopulateFile.populateMedicine5();
        //PopulateFile.populatePrescription5();
        //Display.displayMedicines();
        Display.displayRatings();
        //PopulateFile.populateTerminations();
        
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
   
    
}

