package coursework.Users;

public class Doctor extends User{
    
    String address = "Address NOT SET";
    
    public Doctor(String _uniqueID, String _password, String _firstName, 
            String _lastName, String _address){
        
        super(_uniqueID, _password, _firstName, _lastName, 'D');                //constructs from base class
        
        address = _address;
        
    }

}
