package coursework.Users;

public class Secretary extends User{
    
    public Secretary(String _uniqueID, String _password, String _firstName, 
            String _lastName){
        
        super(_uniqueID, _password, _firstName, _lastName, 'S'); //constructs from base class
        
    }
    
}
