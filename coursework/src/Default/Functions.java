package Default;
import coursework.Forms.*;
import coursework.Users.User;
import java.io.*;

public class Functions {
    
    public static void writeUsersToFile(User[] _userArray) throws IOException{                                    //Writes the array of users into a file.
        
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        
        outputStream.writeObject(_userArray);       
        
    }    
    
    public static User[] readFile() throws IOException, ClassNotFoundException{                                 //Reads the array of users from a file.   
        
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.txt"));
        User userArray[] = (User[]) inputStream.readObject();
        
        return userArray;
        
    }
    
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
        arrayLength = readFile().length;
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        User userArray[] = new User[arrayLength];
        
        //gets user position
        try{
            userArray = readFile();
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
        
        switch(_class){
            case 'A':
                //search admin
            case 'D':
                //search doctor
            case 'P':
                //search patient
            case 'S':
                //search secretary
            default:
        }
        
        return outputID;
        
    }
    
    public static void printArray(){
        
        User array[] = null;
        
        try{
            array = readFile();
        }
        catch(Exception e){
            System.out.println("Error in printArray");
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getUniqueID());
        }
        
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
    
}
