package coursework.Users;

public class Patient extends User{

    String address;
    char sex;
    String dateOfBirth;
    
    public Patient(String _uniqueID, String _password, String _firstName, String _lastName, String _address, char _sex, String _dateOfBirth){ //constructor
        
        super(_uniqueID, _password, _firstName, _lastName, 'P'); //constructs from base class
        
        //sets attributes for the subclass.
        this.address = _address;
        this.sex = _sex;
        this.dateOfBirth = _dateOfBirth;
    }
    
//    public String getAddress(){
//        return address;
//    }
//    
//    public char getSex(){
//        return sex;
//    }
//    
//    public String getDOB(){
//        return dateOfBirth;
//    }
    
}
