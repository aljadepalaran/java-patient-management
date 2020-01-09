package Default;
import coursework.Views.Login;
import coursework.Controllers.Display;
import coursework.Controllers.Populate;
public class Coursework {
    public static void main(String[] args) {   
        Populate.populateFile();    //needed to generate the file when built.
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }
}

