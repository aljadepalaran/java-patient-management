package Default;

public class Functions {
    
    public static void ParseCSV(){
        //parse file and convert to classes
    }
    
    public static String convertCharToString(char[] _array){
            
        String output = "";
        char[] currentArray = _array;
        int arrayLength = currentArray.length;
        
        for(int x = 0; x < arrayLength; x++){
            output = output + currentArray[x];
        }
        
        return output;
        
    }
    
    public static boolean authenticateLogin(String _username, String _password){
        
        boolean authFlag = false; //default to false
        String username = _username;
        String password = _password;
        
        
        if(username.compareTo("aljadepalaran") == 0){
            if(password.compareTo("test") == 0){
                authFlag = true;
            }
            else{
                //auth failed
            }
        }
        else{
            //auth failed
        }
        
        return authFlag; 
        
    }
    
    public static String getPasswordFromFile(){
        String output = "";
        
        
        return output;
    }
    
}
