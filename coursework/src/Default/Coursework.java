package Default;
import coursework.Forms.*;
import coursework.Functions.*;
public class Coursework {
    public static void main(String[] args) {   
        Populate.populateFile();
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }
}

