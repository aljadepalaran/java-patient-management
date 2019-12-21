package coursework.Users;

public class User {
    
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
    
}
