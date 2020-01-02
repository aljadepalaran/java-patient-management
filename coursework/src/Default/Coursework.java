package Default;
import coursework.Forms.Login;
import coursework.Functions.*;
import coursework.Users.User;
public class Coursework {


    public static void main(String[] args) {   
        
//        PopulateFile.populateAppRequests();
//        PopulateFile.populateAppointment5();
//        PopulateFile.populateProposed();

        Display.displayAppRequests();
        Display.displayAppointments();
        Display.displayProposed();
        Display.displayTerminationRequests();
        
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
   
    
}

