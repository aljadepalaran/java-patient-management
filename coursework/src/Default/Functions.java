package Default;
import coursework.Forms.*;
import coursework.Users.User;
import java.io.*;

public class Functions {
    
    public static String convertCharToString(char[] _charArray){                                                //Converts the character array to a string.
        
        String outputString = "";
        int arrayLength = _charArray.length;
        
        for(int x = 0; x < arrayLength; x++){
            outputString = outputString + _charArray[x];
        }
        
        return outputString;
        
    }
    
    public static boolean authenticateLogin(String _uniqueID, String _password){
        
        boolean authFlag = false; //default to false
        String uniqueID = _uniqueID;
        String password = _password;
        User logUser = getUser(uniqueID); //fetches the user object trying to login.
        
        if(logUser == null){
            System.out.println("User does not exist!");
        }
        else{
            if(logUser.getPassword().compareTo(password) == 0){
                authFlag = true;
            }
            else{}
        }
      
        return authFlag; 

    }
    
    public static User getUser(String _uniqueID){
        
        User foundUser = null;
        int arrayLength = 0;
        boolean auth_flag = false;
        int arrayPos = 0;
        
        //gets length of array
        try{
        arrayLength = FileIO.readFile().length;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        User userArray[] = new User[arrayLength];
        
        try{
            userArray = FileIO.readFile();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < arrayLength; i++){
            if(userArray[i].getUniqueID().compareTo(_uniqueID) == 0){
                auth_flag = true;
                arrayPos = i;
                break;
            }
            else{}
        }
        
        if(auth_flag == true){
            foundUser = userArray[arrayPos];
        }
        
        return foundUser;
        
    }
    
    public static String generateID(char _class){
        
        String outputID = "XXXXX";
        
        User readArray[] = null;                //Stores the array read from the file.
        User checkArray[] = new User[1];        //Stores the value of the specific class being checked.
        
        //Reads value from the file into the array.
        try{
            readArray = FileIO.readFile();
        }catch(Exception e){
            System.out.println("Error reading from file!");
        }
        
        if(_class == 'A'){
            
            //Populates checkArray with only admin users.
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("A") == 0){//If the unique ID starts with A
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Functions.resizeArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
                
            
           
            //For each, does AXXXX exist? if yes, increase XXXX and check.
            for(int increment = 0; increment < 9999; increment++){
                
                String checkString = "";
                int state = 0;
                
                if(increment < 10){
                    checkString = "A000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "A00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "A0" + Integer.toString(increment);
                }else{
                    checkString = "A" + Integer.toString(increment);
                }
                
                
                
                while(state == 0){//while not found a matching value
                    int lengthArr = checkArray.length;
                    for(int arrCount = 0; arrCount < lengthArr; arrCount++){                        //Loops through all the existing users to check.
                        System.out.println(arrCount);
                        if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){                 //If unique ID already exists
                            System.out.println(checkArray[arrCount].getUniqueID() + "==" + checkString + "SKIP");
                            state = 1;
                        }else{
                            System.out.println(checkArray[arrCount].getUniqueID() + "!=" + checkString + "RETURN VALUE");
                            outputID = checkString;
                            state = 2;
                        }
                    }
                    break;
                }
                if(state == 2){
                    System.out.println("Found");
                    break;
                }
                
            }
        }
        else if(_class == 'D'){
            System.out.println("You have chosen Doctor");
        }
        else if(_class == 'P'){
            System.out.println("You have chosen Patient");
        }
        else if(_class == 'S'){
            System.out.println("You have chosen Secretary");

        }

        return outputID;
        
    }
    
    public static void displayMainForm(String _uniqueID){
        
        String userType = _uniqueID.substring(0,1);
        
        if(userType.compareTo("A") == 0){
            MainAdmin adminForm = new MainAdmin(getUser(_uniqueID));
            adminForm.setVisible(true);
        }
        else if(userType.compareTo("D") == 0){
            MainDoctor doctorForm = new MainDoctor(getUser(_uniqueID));
            doctorForm.setVisible(true);
        }
        else if(userType.compareTo("P") == 0){
            MainPatient patientForm = new MainPatient();
            patientForm.setVisible(true);
        }
        else if(userType.compareTo("S") == 0){
            MainSecretary secretaryForm = new MainSecretary();
            secretaryForm.setVisible(true);
        }
        
    }
    
    public static User[] resizeArray(User[] _array, int _newSize){
        
        User outputArray[] = new User[_newSize];
        
        for(int i = 0; i < _array.length; i++){                                 //copies the values over.
            outputArray[i] = _array[i];
        }
        
        return outputArray;
        
    }
    
    public static boolean validateDate(String _date){//verifies correct date format
        boolean output = false;
        
        if(_date.length() == 8){
            if(Integer.parseInt(_date.substring(0, 2)) < 30 && Integer.parseInt(_date.substring(0,2)) > 0){
                if(Integer.parseInt(_date.substring(2,4)) < 12 && Integer.parseInt(_date.substring(2,4)) > 0){
                    if(Integer.parseInt(_date.substring(4,8)) > 1900 && Integer.parseInt(_date.substring(4,8)) < 2050){
                        output = true;
                    }
                    else{}
                }
                else{}
            }
            else{}
        }
        else{
            System.out.println("Incorrect date format!");
        }
        return output;
    }
    
}
