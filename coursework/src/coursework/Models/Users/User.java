package coursework.Models.Users;

import coursework.Models.Objects.Observer;
import java.io.Serializable;

public class User implements Serializable, Observer{
    
    private String uniqueID;
    private String password;
    private String firstName;
    private String lastName;
    private char accessKey;
    private boolean hasObservable;
    
    public User(String _uniqueID, String _password, String _firstName, 
            String _lastName, char _accessKey){
        
        this.uniqueID = _uniqueID;
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.accessKey = 'U';
        this.hasObservable = false;
        
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
    public boolean getHasObservable(){
        return this.hasObservable;
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

    @Override
    public void update(boolean _input) {
        this.hasObservable = _input;
    }
    
}
