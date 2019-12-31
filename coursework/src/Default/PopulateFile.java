package Default;
import coursework.Users.*;
public class PopulateFile {
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
            System.out.println("E: POP4! " + e);
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
    public static void populateFile(){
        User userArray[] = new User[5000];
        for(int i = 0; i < 5000; i++){
            String stringCounter = Integer.toString(i);
            int scLength = stringCounter.length();
            String newID = "";
            User newUser = null;
            if(stringCounter.substring(scLength - 1, scLength).compareTo("0") == 0){
                if(i < 10){
                    newID = "A000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "A00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "A0" + Integer.toString(i);
                }else{
                    newID = "A" + Integer.toString(i);
                }
                newUser = new Administrator(newID, "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("1") == 0){
                if(i < 10){
                    newID = "A000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "A00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "A0" + Integer.toString(i);
                }else{
                    newID = "A" + Integer.toString(i);
                }
                newUser = new Administrator(newID, "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("2") == 0){
                if(i < 10){
                    newID = "A000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "A00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "A0" + Integer.toString(i);
                }else{
                    newID = "A" + Integer.toString(i);
                }
                newUser = new Administrator(newID, "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("3") == 0){
                if(i < 10){
                    newID = "D000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "D00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "D0" + Integer.toString(i);
                }else{
                    newID = "D" + Integer.toString(i);
                }
                newUser = new Doctor(newID, "TEST", "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("4") == 0){
                if(i < 10){
                    newID = "D000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "D00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "D0" + Integer.toString(i);
                }else{
                    newID = "D" + Integer.toString(i);
                }
                newUser = new Doctor(newID, "TEST", "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("5") == 0){
                if(i < 10){
                    newID = "P000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "P00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "P0" + Integer.toString(i);
                }else{
                    newID = "P" + Integer.toString(i);
                }
                newUser = new Patient(newID, "TEST", "TEST", "TEST", "TEST", 'M', "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("6") == 0){
                if(i < 10){
                    newID = "P000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "P00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "P0" + Integer.toString(i);
                }else{
                    newID = "P" + Integer.toString(i);
                }
                newUser = new Patient(newID, "TEST", "TEST", "TEST", "TEST", 'M', "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("7") == 0){
                if(i < 10){
                    newID = "S000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "S00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "S0" + Integer.toString(i);
                }else{
                    newID = "S" + Integer.toString(i);
                }
                newUser = new Secretary(newID, "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("8") == 0){
                if(i < 10){
                    newID = "S000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "S00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "S0" + Integer.toString(i);
                }else{
                    newID = "S" + Integer.toString(i);
                }
                newUser = new Secretary(newID, "TEST", "TEST", "TEST");
            }else if(stringCounter.substring(scLength - 1, scLength).compareTo("9") == 0){
                if(i < 10){
                    newID = "S000" + Integer.toString(i);
                }else if(i < 100){
                    newID = "S00" + Integer.toString(i);
                }else if(i < 1000){
                    newID = "S0" + Integer.toString(i);
                }else{
                    newID = "S" + Integer.toString(i);
                }
                newUser = new Secretary(newID, "TEST", "TEST", "TEST");
            }
            userArray[i] = newUser;
        }
        try{
            FileIO.writeUsersToFile(userArray);
        }catch(Exception e){
            System.out.println("E: POPF");
        }
    }
}
