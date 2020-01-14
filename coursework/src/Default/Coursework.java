package Default;
import coursework.Controllers.Populate;
import coursework.Views.Login;
public class Coursework {
    public static void main(String[] args) {
        
        Populate.populateFile();
        /**
         * Opens the login form at the start of the program.
         */
        Login loginForm = new Login();
        loginForm.setVisible(true);
        
    }
}

