package coursework.Objects;

public class Session {
    private static Session instance;
    private String userID;
    private Session(){
    }
    public static Session getInstance(String _uniqueID){
        if(instance == null){
            instance = new Session();
            instance.userID = _uniqueID;
        }
        return instance;
    }
    public String getUID(){
        return userID;
    }
    public void setUID(String _uniqueID){
        userID = _uniqueID;
    }
}
