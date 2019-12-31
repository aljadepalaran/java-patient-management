package Default;
import coursework.Forms.*;
import coursework.Objects.Session;
import coursework.Users.User;
public class Functions {
    public static String convertCharToString(char[] _charArray){                                                                        //Converts the character array to a string.
        String outputString = "";
        int arrayLength = _charArray.length;
        for(int x = 0; x < arrayLength; x++){
            outputString = outputString + _charArray[x];
        }
        return outputString;
    }
    public static boolean authenticateLogin(String _uniqueID, String _password){
        boolean authFlag = false;                                                                                                       //Default to false.
        String uniqueID = _uniqueID;
        String password = _password;
        User logUser = getUser(uniqueID);                                                                                               //Fetches the user object trying to login.
        if(logUser == null){
            System.out.println("User does not exist!");
        }else{
            if(logUser.getPassword().compareTo(password) == 0){
                authFlag = true;
            }else{}
        }
        return authFlag; 
    }
    public static User getUser(String _uniqueID){
        User foundUser = null;
        boolean auth_flag = false;
        int arrayPos = 0;
        User userArray[] = null;
        try{
            userArray = FileIO.readFile();
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
            foundUser = userArray[arrayPos];
        }
        return foundUser;
    }
    public static String generateID(char _class){
        String outputID = "XXXXX";                                                                                                      //Stores the output.
        User readArray[] = null;                                                                                                        //Stores the array read from the file.
        User checkArray[] = new User[1];      
        try{
            readArray = FileIO.readFile();
        }catch(Exception e){
            System.out.println("Error reading from file! " + e);
        }
        if(_class == 'A'){
            //Populates the checkArray with only administrator objects.
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("A") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Functions.resizeArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){                                                                      //Loops through all possible UID values.
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;                                                                                                          //0 = default; 1 = UID already exists.
                if(increment < 10){
                    checkString = "A000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "A00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "A0" + Integer.toString(increment);
                }else{
                    checkString = "A" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){                                                                //Loops through all the objects found in the file.
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){           
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > SKIP");
                        state = 1;                                                                                                      //Sets state to found.
                    }else{
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > RETURN VALUE");                        
                        outputID = checkString;                       
                    }
                }                
                if(state == 1){                                                                                                         //Checks if the value exists.
                }else if(state == 0){
                    return outputID;                                                                                                    //If value doesn't exist, return value.
                }
            }
        }
        else if(_class == 'D'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Functions.resizeArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }                    
                }                
            }         
            for(int increment = 0; increment < 9999; increment++){               
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                if(increment < 10){
                    checkString = "D000" + Integer.toString(increment);
                }else if(increment < 100){
                
                    checkString = "D00" + Integer.toString(increment);
                }else if(increment < 1000)
                {
                    checkString = "D0" + Integer.toString(increment);
                }else{
                    checkString = "D" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){              
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){           
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > SKIP");
                        state = 1;
                    }else{
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > RETURN VALUE");
                        outputID = checkString;
                    }
                }             
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        else if(_class == 'P'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Functions.resizeArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){
                
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                
                if(increment < 10){
                    checkString = "P000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "P00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "P0" + Integer.toString(increment);
                }else{
                    checkString = "P" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){           
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){           
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > SKIP");
                        state = 1; 
                    }else{
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > RETURN VALUE");
                        outputID = checkString; 
                    }
                }                 
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        else if(_class == 'S'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("S") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Functions.resizeArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                
                if(increment < 10){
                    checkString = "S000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "S00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "S0" + Integer.toString(increment);
                }else{
                    checkString = "S" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){              
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){           
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > SKIP");
                        state = 1;
                    }else{
                        System.out.println("FILE:" + checkArray[arrCount].getUniqueID() 
                                + " GEN:" + checkString + " > RETURN VALUE");
                        outputID = checkString;
                    }
                }             
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        return outputID;                                                                                                                //Returns XXXXX
    }
    public static void displayMainForm(Session _session){
        //String userType = _uniqueID.substring(0,1);      
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
    public static User[] resizeArray(User[] _array, int _newSize){
        User outputArray[] = new User[_newSize];
        for(int i = 0; i < _array.length; i++){                                                                                         //Copies the values over.
            outputArray[i] = _array[i];
        }
        return outputArray;
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
        }else{
            System.out.println("Incorrect date format!");
        }
        return output;
    }
    public static void removeFromFile(String _uniqueID){
        User userArray[] = null;
        try{
            userArray = FileIO.readFile();
        }catch(Exception e){
            
        }
        
        //change value to null
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i].getUniqueID().compareTo(_uniqueID) == 0){
                userArray[i] = null;
            }
        }
    }
    public static User[] removeNullFromArray(User[] _userArray){
        User[] output = _userArray;
        for(int i = 0; i < _userArray.length; i++){
            if(_userArray[i] == null && i != _userArray.length - 1){
                _userArray[i] = _userArray[i + 1];
                _userArray[i+1] = null;
            }else{}
        }
        while(_userArray[_userArray.length - 1] == null){
            _userArray = resizeDown(_userArray);
        }
        output = _userArray;
        return output;
    }
    public static User[] resizeDown(User[] _userArray){
        User output[] = new User[_userArray.length - 1];
        for(int i = 0; i < output.length; i++){
            output[i] = _userArray[i];
        }
        return output;
    }
}
