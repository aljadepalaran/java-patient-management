package Default;

import coursework.Users.*;

public class TestClass {
    
    public static void populateFour(){
        
        User adminTest = new Administrator("A0001", "adminP4SS", "Admin", "One");
        User doctorTest = new Doctor("D0001", "docP4SS", "Doctor", "One", "Plymouth");
        User patientTest = new Patient("P0001", "patientP4SS", "Patient", "One", "Plymouth", 'M', "19022000");
        User secretaryTest = new Secretary("S0001", "secr3t", "Secret", "Agent");
        
        User[] userArray = new User[4];
        
        userArray[0] = adminTest;
        userArray[1] = doctorTest;
        userArray[2] = patientTest;
        userArray[3] = secretaryTest;

        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println("E: POP4");
        }
        
    }
    public static void populateHundred(){
        
        User[] userArray = new User[100];
        
        for(int i = 0; i < 100; i++){
            
            User newUser = new Patient(Integer.toString(i), "TEST1", "TEST2", "TEST3", "TEST4", 'M', "19022000");
            userArray[i] = newUser;
            
        }
        
        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println("E: POP100");
        }
        
    }
    public static void populateAdmin(){
                
        User userArray[] = new User[800];
        userArray[0] = new Administrator("A0000", "adminP4SS", "Admin", "One");
        for(int i = 1; i < 800; i++){
            
            User newUser = new Administrator(("A0"+Integer.toString(i)), "adminP4SS", "Admin", "One");
            
            userArray[i] = newUser;
            
        }
        
        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println("E: POP100");
        }
        
    }
    public static void populateRandom(){ //BROKEN
        
        User userArray[] = new User[9999];
        
        for(int totalCount = 0; totalCount < 9999; totalCount++){
            String countString = Integer.toString(totalCount);
            if(countString.substring(countString.length() - 1, countString.length()) == "0" || countString.substring(countString.length() - 1, countString.length()) == "1" || countString.substring(countString.length() - 1, countString.length()) == "2"){
                String checkString = "";
                if(totalCount < 10){
                    checkString = "A000" + Integer.toString(totalCount);
                }else if(totalCount < 100){
                    checkString = "A00" + Integer.toString(totalCount);
                }else if(totalCount < 1000){
                    checkString = "A0" + Integer.toString(totalCount);
                }else{
                    checkString = "A" + Integer.toString(totalCount);
                }
                User newUser = new Administrator(checkString, "TEST", "TEST", "TEST");
                userArray[totalCount] = newUser;
            }
            else if(countString.substring(countString.length() - 1, countString.length()) == "3" || countString.substring(countString.length() - 1, countString.length()) == "4"){
                
                String checkString = "";
                if(totalCount < 10){
                    checkString = "D000" + Integer.toString(totalCount);
                }else if(totalCount < 100){
                    checkString = "D00" + Integer.toString(totalCount);
                }else if(totalCount < 1000){
                    checkString = "D0" + Integer.toString(totalCount);
                }else{
                    checkString = "D" + Integer.toString(totalCount);
                }
                User newUser = new Doctor(checkString, "docP4SS", "Doctor", "One", "Plymouth");
                userArray[totalCount] = newUser;
            }
            else if(countString.substring(countString.length() - 1, countString.length()) == "5" || countString.substring(countString.length() - 1, countString.length()) == "6"){
                String checkString = "";
                if(totalCount < 10){
                    checkString = "P000" + Integer.toString(totalCount);
                }else if(totalCount < 100){
                    checkString = "P00" + Integer.toString(totalCount);
                }else if(totalCount < 1000){
                    checkString = "P0" + Integer.toString(totalCount);
                }else{
                    checkString = "P" + Integer.toString(totalCount);
                }
                User newUser = new Patient(checkString, "patientP4SS", "Patient", "One", "Plymouth", 'M', "19022000");
                userArray[totalCount] = newUser;
            }
            else if(countString.substring(countString.length() - 1, countString.length()) == "7" || countString.substring(countString.length() - 1, countString.length()) == "8" || countString.substring(countString.length() - 1, countString.length()) == "9"){
                String checkString = "";
                if(totalCount < 10){
                    checkString = "S000" + Integer.toString(totalCount);
                }else if(totalCount < 100){
                    checkString = "S00" + Integer.toString(totalCount);
                }else if(totalCount < 1000){
                    checkString = "S0" + Integer.toString(totalCount);
                }else{
                    checkString = "S" + Integer.toString(totalCount);
                }
                User newUser = new Secretary(checkString, "TEST", "TEST", "TEST");
                userArray[totalCount] = newUser;
            }
        }
        
        for(int i = 4; i < 500; i++){
            System.out.println(userArray[i].getUniqueID() + ":" + userArray[i].getPassword()
            + ":" + userArray[i].getFirstName() + ":" + userArray[i].getLastName());
            
        }
        
//        try{
//            FileIO.writeUsersToFile(userArray);
//        }catch(Exception e){
//            System.out.println("E: POP100");
//        }
    } //BROKEN
}
