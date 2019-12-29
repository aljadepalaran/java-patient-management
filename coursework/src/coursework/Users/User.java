package coursework.Users;

import java.io.Serializable;

public class User implements Serializable{
    
    private String uniqueID;
    private String password;
    private String firstName;
    private String lastName;
    private char accessKey;
    
    public User(String _uniqueID, String _password, String _firstName, 
            String _lastName, char _accessKey){
        
        this.uniqueID = _uniqueID;
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.accessKey = 'U';
        
    }
    
    //GET Methods.
    public String getUniqueID(){
        return this.uniqueID;
    }
    public String getPassword(){
        return this.password;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public char getAccessKey(){
        return this.accessKey;
    }
    
    //SET Methods.
    public void setUniqueID(String _uniqueID){
        this.uniqueID = _uniqueID;
    }
    public void setPassword(String _password){
        this.password = _password;
    }
    public void setFirstName(String _firstName){
        this.firstName = _firstName;
    }
    public void setLastName(String _lastName){
        this.lastName = _lastName;
    }
    public void setAccessKey(char _accessKey){
        this.accessKey = _accessKey;
    }
    
}
