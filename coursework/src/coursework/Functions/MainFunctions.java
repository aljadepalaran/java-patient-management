package coursework.Functions;

import coursework.Forms.*;
import coursework.Objects.*;
import coursework.Users.*;

public class MainFunctions {
    
    public static String charToString(char[] _input){
        String output = "";
        for(int i = 0; i < _input.length; i++){
            output = output + _input[i];
        }
        return output;
    }
    public static boolean authenticateLogin(String _uniqueID, String _password){
        boolean authFlag = false;       
        User checkUser = getUser(_uniqueID);                                                                                               //Fetches the user object trying to login.
        if(checkUser == null){
            System.out.println("User does not exist!");
        }else{
            if(checkUser.getPassword().compareTo(_password) == 0){
                authFlag = true;
            }else{}
        }
        return authFlag; 
    }
    public static User getUser(String _uniqueID){
        User output = null;
        boolean auth_flag = false;
        int arrayPos = 0;
        User userArray[] = null;
        try{
            userArray = FileReader.readUsers();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i].getUniqueID().compareTo(_uniqueID) == 0){
                auth_flag = true;
                arrayPos = i;
                break;
            }else{}
        }
        if(auth_flag == true){
            output = userArray[arrayPos];
        }
        return output;
    }
    public static void displayMainForm(Session _session){
        String userType = _session.getUID().substring(0,1);
        if(userType.compareTo("A") == 0){                                                                                               //Displays Administrator form.
            MainAdministrator adminForm = new MainAdministrator(_session);
            adminForm.setVisible(true);
        }else if(userType.compareTo("D") == 0){                                                                                         //Displays Doctor form.
            MainDoctor doctorForm = new MainDoctor(_session);
            doctorForm.setVisible(true);
        }else if(userType.compareTo("P") == 0){                                                                                         //Displays Patient form.
            MainPatient patientForm = new MainPatient(_session);
            patientForm.setVisible(true);
        }else if(userType.compareTo("S") == 0){                                                                                         //Displays Secretary form.
            MainSecretary secretaryForm = new MainSecretary(_session);
            secretaryForm.setVisible(true);
        }
    }
    public static boolean validateDate(String _date){                                                                                   //Verifies correct date format
        boolean output = false;
        if(_date.length() == 8){
            if(Integer.parseInt(_date.substring(0, 2)) < 30 && Integer.parseInt(_date.substring(0,2)) > 0){
                if(Integer.parseInt(_date.substring(2,4)) < 12 && Integer.parseInt(_date.substring(2,4)) > 0){
                    if(Integer.parseInt(_date.substring(4,8)) > 1900 && Integer.parseInt(_date.substring(4,8)) < 2050){
                        output = true;
                    }else{}
                }else{}
            }else{}
        }else{}
        return output;
    }
    public static Rating[] getRating(String _doctorID){
        Rating readArray[] = null;
        Rating doctorRating[] = new Rating[1]; //will store the ratings for the specific doctor.
        try{
            readArray = FileReader.readRatings();
        }catch(Exception e){
            
        }
        for(int i = 0; i < readArray.length; i++){
            if(readArray[i].getDoctorID().compareTo(_doctorID) == 0){
                if(doctorRating[doctorRating.length - 1] == null){
                    doctorRating[doctorRating.length - 1] = readArray[i];
                }else{
                    doctorRating = Resize.ratingArray(doctorRating, doctorRating.length + 1);
                    doctorRating[doctorRating.length - 1] = readArray[i];
                }
            }
        }
        return doctorRating;
    }
}
