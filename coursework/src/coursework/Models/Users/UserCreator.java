package coursework.Models.Users;
import coursework.Controllers.Augment;

/**
 * Implementation of the strategy pattern.
 * Decides which user is to be created.
 */

public class UserCreator {//STRATEGY PATTERN
    public static interface createUser{
        public User generateUser(String _id, String _password, String _first, String _second, String _address, char _sex, String _date);
    }
    public abstract class abstractSimple implements createUser{}
    public abstract class abstractDoctor implements createUser{}
    public abstract class abstractPatient implements createUser{}
    public class adminCreator extends abstractSimple{
        @Override
        public User generateUser(String _id, String _password, String _first, String _second, String _address, char _sex, String _date) {
            User newUser = new Administrator(_id, _password, _first, _second);
            return newUser;
        }
    }
    public class secretaryCreator extends abstractSimple{
        @Override
        public User generateUser(String _id, String _password, String _first, String _second, String _address, char _sex, String _date) {
            User newUser = new Secretary(_id, _password, _first, _second);
            return newUser;
        }
    }
    public class doctorCreator extends abstractDoctor{
        @Override
        public User generateUser(String _id, String _password, String _first, String _second, String _address, char _sex, String _date) {
            User newUser = new Doctor(_id, _password, _first, _second, _address);
            return newUser;
        }
    }
    public class patientCreator extends abstractPatient{
        @Override
        public User generateUser(String _id, String _password, String _first, String _second, String _address, char _sex, String _date) {
            User newUser = new Patient(_id, _password, _first, _second, _address, _sex, _date);
            return newUser;
        }
    }
    
    public void addUserToSystem(String _uniqueID, String _password, String _first, String _second, String _address, char _sex, String _date){
        if(_uniqueID.substring(0,1).compareTo("A") == 0){
            adminCreator creator = new adminCreator();
            User newUser = creator.generateUser(_uniqueID, _password, _first, _second, _address, _sex, _date);
            Augment.addUser(newUser);
        }
        else if(_uniqueID.substring(0,1).compareTo("D") == 0){
            doctorCreator creator = new doctorCreator();
            User newUser = creator.generateUser(_uniqueID, _password, _first, _second, _address, _sex, _date);
            Augment.addUser(newUser);
        }
        else if(_uniqueID.substring(0,1).compareTo("P") == 0){
            patientCreator creator = new patientCreator();
            User newUser = creator.generateUser(_uniqueID, _password, _first, _second, _address, _sex, _date);
            Augment.addRequest(newUser);
        }
        else if(_uniqueID.substring(0,1).compareTo("S") == 0){
            secretaryCreator creator = new secretaryCreator();
            User newUser = creator.generateUser(_uniqueID, _password, _first, _second, _address, _sex, _date);
            Augment.addUser(newUser);
        }
        
    }  
}
