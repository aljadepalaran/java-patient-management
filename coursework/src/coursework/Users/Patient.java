package coursework.Users;

public class Patient extends User{

    public Patient(String _uniqueID, String _password, String _firstName, 
            String _lastName, char _accessKey){
        
        super(_uniqueID, _password, _firstName, _lastName, _accessKey); //constructs from base class
        
        this.accessKey = 'P';
        
    }
    
}
