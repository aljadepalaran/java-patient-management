package Default;
import coursework.Users.User;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class FileIO {                                                                                               //Class for everything File IO related.  
    public static void writeUsersToFile(User[] _userArray) throws IOException{                                      //Writes the array of users into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        outputStream.writeObject(_userArray);       
    }        
    public static User[] readFile() throws IOException, ClassNotFoundException{                                     //Reads the array of users from a file.   
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.txt"));
        User userArray[] = (User[]) inputStream.readObject();                                                       //Typecasting
        return userArray;
    }   
    public static void displayArray(){
        User[] output = null;
        try{
            output = FileIO.readFile();
        }catch(Exception e){
            System.out.println("Error! Flag DEFI! " + e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getUniqueID() + ":" + output[i].getPassword()
            + ":" + output[i].getFirstName() + ":" + output[i].getLastName());
        }
    }
    public static void addUserToFile(User _user){
        User userArray[] = null;
        boolean hasNull = false;
        try{
            userArray = FileIO.readFile();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < userArray.length; i++){
            if(userArray[i] == null){//if there is space
                userArray[i] = _user;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            userArray = Functions.resizeArray(userArray, userArray.length + 1);
            userArray[userArray.length - 1] = _user;
        }
        
        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
