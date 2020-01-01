package Default;
import coursework.Forms.Login;
import coursework.Functions.Display;
import coursework.Functions.FileWriter;
import coursework.Objects.Rating;
import coursework.Users.*;
public class Coursework {


    public static void main(String[] args) {   
        
        //PopulateFile.populateAppointment5();
        //Display.displayAppointments();
        
//        User arr[] = new User[1];
//        User test = new Patient("P0008", "patientP4SS", "Patient", "One", "Plymouth", 'M', "19022000");
//        arr[0] = test;
//        try{
//            FileWriter.writeRequests(arr);
//        }catch(Exception e){}

        //Display.displayRequests();
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
    
}

