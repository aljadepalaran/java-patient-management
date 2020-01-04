package Default;
import coursework.Forms.*;
import coursework.Functions.*;
public class Coursework {
    public static void main(String[] args) {   
        Populate.populateFile();    //needed to generate the file when built.
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }
}

