package Default;
import coursework.Forms.Login;
import coursework.Functions.Display;
import coursework.Functions.FileWriter;
import coursework.Objects.Rating;
import coursework.Users.*;
public class Coursework {


    public static void main(String[] args) {   
        
        //PopulateFile.populateMedicine5();
        //PopulateFile.populatePrescription5();
        //Display.displayMedicines();
        //PopulateFile.populateAppRequests();
        Display.displayOrders();
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
    
}

