package coursework.Models.Users;

public class Doctor extends User{
    
    private String address = "Address NOT SET";
    
    public Doctor(String _uniqueID, String _password, String _firstName, 
            String _lastName, String _address){
        
        super(_uniqueID, _password, _firstName, _lastName, 'D');                //constructs from base class
        
        this.address = _address;
        
    }
    
    //GET Methods.
    public String getAddress(){
        return this.address;
    }
    
    //SET Methods.
    public void setAddress(String _address){
        this.address = _address;
    }

}
