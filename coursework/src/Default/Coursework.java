package Default;
import coursework.Forms.*;
import coursework.Users.*;
public class Coursework {


    public static void main(String[] args) {   
        
        //TestClass.populateFile();
        //FileIO.displayArray();

//        Login loginForm = new Login();
//        loginForm.setVisible(true);
        
        test();
    }
    
    public static void test(){
        User adminTest = new Administrator("A0001", "adminP4SS", "Admin", "One");
        User doctorTest = new Doctor("D0001", "docP4SS", "Doctor", "One", "Plymouth");
        User patientTest = new Patient("P0001", "patientP4SS", "Patient", "One", "Plymouth", 'M', "19022000");
        User secretaryTest = new Secretary("S0001", "secr3t", "Secret", "Agent");
        User[] userArray = new User[4];
        userArray[0] = adminTest;
        userArray[1] = null;
        userArray[2] = patientTest;
        userArray[3] = secretaryTest;
        
        userArray = Functions.removeNullFromArray(userArray);
        
        for(int i = 0; i < userArray.length; i++){
            System.out.println(userArray[i]);
        }
        
    }
   
}

