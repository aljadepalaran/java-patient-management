package Default;
import coursework.Controllers.Display;
import coursework.Views.Login;
import coursework.Controllers.Populate;
import coursework.Controllers.FileReader;
public class Coursework {
    public static void main(String[] args) {

        Display.displayAppointments();
        Populate.populateFile();
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
        //checkFile();
    }
    
    /**
    * Checks if the data has been populated.
    * If the data files don't exist, run the Populate.populateFile() function.
    * This will populate the system with the data needed for the program to work.
    */
    public static void checkFile(){
        try{
            FileReader.readUsers();
            Login loginForm = new Login();
            loginForm.setVisible(true);
        }catch(Exception e){
        Populate.populateFile();    //needed to generate the file when built.
        checkFile();
        }
    }
}

