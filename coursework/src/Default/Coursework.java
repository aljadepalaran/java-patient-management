package Default;
import coursework.Views.Login;
import coursework.Controllers.FileReader;
import coursework.Controllers.Populate;
import coursework.Controllers.FileReader;
public class Coursework {
    public static void main(String[] args) {

        checkFile();
    }
    
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

