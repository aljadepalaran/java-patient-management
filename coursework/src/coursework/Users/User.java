package coursework.Users;

import java.io.Serializable;

public class User implements Serializable{
    
    String uniqueID;
    String password;
    String firstName;
    String lastName;
    char accessKey;
    
    public User(String _uniqueID, String _password, String _firstName, 
            String _lastName, char _accessKey){
        
        this.uniqueID = _uniqueID;
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.accessKey = 'U';
        
    }
    
    public String getUniqueID(){
        return uniqueID;
    }
    public String getPassword(){
        return password;
    }
    public String getFirstNames(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getAccessKey(){
        return accessKey;
    }
    
}
