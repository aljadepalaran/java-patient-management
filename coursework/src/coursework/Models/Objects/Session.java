package coursework.Models.Objects;

/**
 * A session class which uses the Singleton design pattern.
 * @author palar
 */
public class Session {
    private static Session instance;
    private String userID;
    private Session(){
    }
    
    /**
     * Retrieves instance if it exists.
     * Creates a new instance if it doesn't exist.
     * @param _uniqueID
     * @return 
     */
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
