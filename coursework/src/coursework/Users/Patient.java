package coursework.Users;

public class Patient extends User{

    String address;
    char sex;
    int age;
    
    public Patient(String _uniqueID, String _password, String _firstName, String _lastName, char _accessKey, String _address, char _sex, int _age){ //constructor
        
        super(_uniqueID, _password, _firstName, _lastName, _accessKey); //constructs from base class
        
        //sets attributes for the subclass.
        this.accessKey = 'P';
        this.address = _address;
        this.sex = _sex;
        this.age = _age;
        
    }
    
}
