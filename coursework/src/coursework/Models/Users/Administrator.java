package coursework.Models.Users;

public class Administrator extends User{
    
    public Administrator(String _uniqueID, String _password, String _firstName, 
            String _lastName){
        
        super(_uniqueID, _password, _firstName, _lastName, 'A'); //constructs from base class
        
    }
    
}
