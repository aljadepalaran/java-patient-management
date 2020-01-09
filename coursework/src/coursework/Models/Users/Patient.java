package coursework.Models.Users;

public class Patient extends User{

    private String address;
    private char sex;
    private String dateOfBirth;
    
    public Patient(String _uniqueID, String _password, String _firstName, String _lastName, String _address, char _sex, String _dateOfBirth){
        
        super(_uniqueID, _password, _firstName, _lastName, 'P'); //constructs from base class
        
        this.address = _address;
        this.sex = _sex;
        this.dateOfBirth = _dateOfBirth;
        
    }
    
    //GET Methods.
    public String getAddress(){
        return this.address;
    }
    public char getSex(){
        return this.sex;
    }
    public String getDOB(){
        return this.dateOfBirth;
    }
    
    //SET Methods.
    public void setAddress(String _address){
        this.address = _address;
    }
    public void setSex(char _sex){
        this.sex = _sex;
    }
    public void setDOB(String _dateOfBirth){
        this.dateOfBirth = _dateOfBirth;
    }

}
