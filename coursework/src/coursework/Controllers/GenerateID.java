package coursework.Controllers;

import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;
    /**
    * Static class used to generate ID.
    * 
    */
public class GenerateID {
    public static String userID(char _class){
        String outputID = "XXXXX";                                                                                                      //Stores the output.
        User readArray[] = null;                                                                                                        //Stores the array read from the file.
        User checkArray[] = new User[1];      
        try{
            readArray = FileReader.readUsers();
        }catch(Exception e){
            
        }
        if(_class == 'A'){
            //Populates the checkArray with only administrator objects.
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("A") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Resize.userArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){                                                                      //Loops through all possible UID values.
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;                                                                                                          //0 = default; 1 = UID already exists.
                if(increment < 10){
                    checkString = "A000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "A00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "A0" + Integer.toString(increment);
                }else{
                    checkString = "A" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){                                                                //Loops through all the objects found in the file.
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){         
                        state = 1;                                                                                                      //Sets state to found.
                    }else{             
                        outputID = checkString;                       
                    }
                }                
                if(state == 1){                                                                                                         //Checks if the value exists.
                }else if(state == 0){
                    return outputID;                                                                                                    //If value doesn't exist, return value.
                }
            }
        }
        else if(_class == 'D'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("D") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Resize.userArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }                    
                }                
            }         
            for(int increment = 0; increment < 9999; increment++){               
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                if(increment < 10){
                    checkString = "D000" + Integer.toString(increment);
                }else if(increment < 100){
                
                    checkString = "D00" + Integer.toString(increment);
                }else if(increment < 1000)
                {
                    checkString = "D0" + Integer.toString(increment);
                }else{
                    checkString = "D" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){              
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){
                        state = 1;
                    }else{
                        outputID = checkString;
                    }
                }             
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        else if(_class == 'P'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("P") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Resize.userArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                
                if(increment < 10){
                    checkString = "P000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "P00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "P0" + Integer.toString(increment);
                }else{
                    checkString = "P" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){           
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){    
                        state = 1; 
                    }else{
                        outputID = checkString; 
                    }
                }
                //CHECKS REQUESTS FILE
                User reqArr[] = null;
                try{
                    reqArr = FileReader.readRequests();
                }catch(Exception e){}
                for(int arrCount = 0; arrCount < reqArr.length; arrCount++){
                    if(reqArr[arrCount].getUniqueID().compareTo(checkString) == 0){    
                        state = 1; 
                    }else{
                        outputID = checkString; 
                    }
                }
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        else if(_class == 'S'){
            for(int i = 0; i < readArray.length; i++){
                if(readArray[i].getUniqueID().substring(0,1).compareTo("S") == 0){
                    if(checkArray[checkArray.length - 1] == null){
                        checkArray[checkArray.length - 1] = readArray[i];
                    }else{
                        checkArray = Resize.userArray(checkArray, checkArray.length + 1);
                        checkArray[checkArray.length - 1] = readArray[i];
                    }
                }
            }
            for(int increment = 0; increment < 9999; increment++){
                String checkString = "";
                int lengthArr = checkArray.length;
                int state = 0;
                
                if(increment < 10){
                    checkString = "S000" + Integer.toString(increment);
                }else if(increment < 100){
                    checkString = "S00" + Integer.toString(increment);
                }else if(increment < 1000){
                    checkString = "S0" + Integer.toString(increment);
                }else{
                    checkString = "S" + Integer.toString(increment);
                }
                for(int arrCount = 0; arrCount < lengthArr; arrCount++){              
                    if(checkArray[arrCount].getUniqueID().compareTo(checkString) == 0){ 
                        state = 1;
                    }else{
                        outputID = checkString;
                    }
                }             
                if(state == 1){
                }else if(state == 0){
                    return outputID;
                }
            }
        }
        return outputID;                                                                                                                //Returns XXXXX
    }
    public static String feedbackID(){
        String output = "";
        Feedback feedbackArray[] = null;
        try{
            feedbackArray = FileReader.readFeedback();
        }catch(Exception e){
            
        }
        for(int i = 0; i < 9999; i++){
            String checkID = "";
            int state = 0;
            if(i < 10){
                checkID = "000" + Integer.toString(i);
            }else if(i < 100){
                checkID = "00" + Integer.toString(i);
            }else if(i < 1000){
                checkID = "0" + Integer.toString(i);
            }else{
                checkID = "" + Integer.toString(i);
            }
            for(int x = 0; x < feedbackArray.length; x++){
                if(feedbackArray[x].getFeedbackID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            if(state == 1){
                //do nothing
            }else if(state == 0){
                return output;
            }
        }
        return output;
    }
    public static String appointmentID(){
        String output = "";
        Appointment appointmentArray[] = null;
        Appointment reqApps[] = null;
        Appointment proposed[] = null;
        try{
            appointmentArray = FileReader.readAppointments();
            proposed = FileReader.readProposedAppointments();
            reqApps = FileReader.readAppointmentRequests();
        }catch(Exception e){
            
        }
        for(int i = 0; i < 9999; i++){
            String checkID = "";
            int state = 0;
            if(i < 10){
                checkID = "000" + Integer.toString(i);
            }else if(i < 100){
                checkID = "00" + Integer.toString(i);
            }else if(i < 1000){
                checkID = "0" + Integer.toString(i);
            }else{
                checkID = "" + Integer.toString(i);
            }
            for(int x = 0; x < appointmentArray.length; x++){
                if(appointmentArray[x].getAppointmentID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            for(int x = 0; x < reqApps.length; x++){
                if(reqApps[x].getAppointmentID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            for(int x = 0; x < proposed.length; x++){
                if(proposed[x].getAppointmentID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            if(state == 1){
                //do nothing
            }else if(state == 0){
                return output;
            }
        }
        return output;
    }
    public static String prescriptionID(){
        String output = "";
        Prescription allPrescriptions[] = null;
        Prescription requestedPrescriptions[] = null;
        try{
            allPrescriptions = FileReader.readPrescriptions();
            requestedPrescriptions = FileReader.readRequestedPrescriptions();
        }catch(Exception e){
            
        }
        for(int i = 0; i < 9999; i++){
            String checkID = "";
            int state = 0;
            if(i < 10){
                checkID = "000" + Integer.toString(i);
            }else if(i < 100){
                checkID = "00" + Integer.toString(i);
            }else if(i < 1000){
                checkID = "0" + Integer.toString(i);
            }else{
                checkID = "" + Integer.toString(i);
            }
            for(int x = 0; x < allPrescriptions.length; x++){
                if(allPrescriptions[x].getPrescriptionID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            for(int x = 0; x < requestedPrescriptions.length; x++){
                if(requestedPrescriptions[x].getPrescriptionID().compareTo(checkID) == 0){
                    state = 1;
                }else{
                    output = checkID;
                }
            }
            if(state == 1){
                //do nothing
            }else if(state == 0){
                return output;
            }
        }
        return output;
    }
}
