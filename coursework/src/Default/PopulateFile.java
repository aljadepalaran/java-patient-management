package Default;
import coursework.Functions.*;
import coursework.Users.*;
import coursework.Objects.*;
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
    public static void populateRating5(){
        Rating ratingArray[] = new Rating[5];
        ratingArray[0] = new Rating("D0007", "P0002", 5, "Testing #1ihjasd fbi if asasfhasu fo ");
        ratingArray[1] = new Rating("D0005", "P0002", 5, "Testing #2");
        ratingArray[2] = new Rating("D0003", "P0005", 4, "Testing #3");
        ratingArray[3] = new Rating("D0007", "P0002", 2, "Testing #4");
        ratingArray[4] = new Rating("D0006", "P0003", 3, "Testing #5");
        
        try{
            FileIO.writeRatings(ratingArray);
        }catch(Exception e){
            
        }
    }
    public static void populateFeedback5(){
        Feedback feedbackArray[] = new Feedback[5];
        feedbackArray[0] = new Feedback("1523", "D0007", "P0007", "A0005", "TESTING 1");
        feedbackArray[1] = new Feedback("5135", "D0007", "P0007", "A0005", "TESTING 2");
        feedbackArray[2] = new Feedback("1234", "D0005", "P0007", "A0005", "TESTING 3");
        feedbackArray[3] = new Feedback("6432", "D0003", "P0007", "A0005", "TESTING 4");
        feedbackArray[4] = new Feedback("3256", "D0007", "P0007", "A0005", "TESTING 5");
        try{
            FileIO.writeFeedback(feedbackArray);
        }catch(Exception e){
            
        }
        
    }
    public static void populateAppointment5(){
        Appointment output[] = new Appointment[5];
        output[0] = new Appointment("0000", "P0002", "D0007", "01012000", "testing1");
        output[1] = new Appointment("0001", "P0003", "D0007", "01012001", "testing2");
        output[2] = new Appointment("0002", "P0004", "D0007", "01012002", "testing3");
        output[3] = new Appointment("0003", "P0002", "D0007", "01012003", "testing4");
        output[4] = new Appointment("0004", "P0003", "D0007", "01012004", "testing5");
        try{
            FileWriter.writeAppointments(output);
        }catch(Exception e){
            
        }
    }
    public static void populateMedicine5(){
        Medicine arr[] = new Medicine[6];
        arr[0] = new Medicine("Paracetamol", "detail 1", 100);
        arr[1] = new Medicine("Ibruprofen", "detail 2", 100);
        arr[2] = new Medicine("Aspirin", "detail 3", 100);
        arr[3] = new Medicine("Adderall", "detail 4", 100);
        arr[4] = new Medicine("Morphine", "detail 5", 100);
        arr[5] = new Medicine("Amoxicillin", "amox", 0);
        try{
            FileWriter.writeMedicines(arr);
        }catch(Exception e){}
    }
    public static void populateOrders5(){
        Medicine arr[] = new Medicine[5];
        arr[0] = new Medicine("Paracetamol", "detail 1", 5);
        arr[1] = new Medicine("Ibruprofen", "detail 2", 13);
        arr[2] = new Medicine("Aspirin", "detail 3", 6);
        arr[3] = new Medicine("Adderall", "detail 4", 134);
        arr[4] = new Medicine("Morphine", "detail 5", 5);
        try{
            FileWriter.writeMedicineOrders(arr);
        }catch(Exception e){}
    }
    public static void populatePrescription5(){
        Prescription arr[] = new Prescription[5];
        Medicine meds[] = null;
        try{
            meds = FileReader.readMedicines();
        }catch(Exception e){
            
        }
        arr[0] = new Prescription("P0002", "D0007", "Testing", meds[1], 2, "Dosage 1");
        arr[1] = new Prescription("P0002", "D0007", "Testing 2", meds[1], 2, "Dosage 2");
        arr[2] = new Prescription("P0002", "D0007", "Testing 3", meds[1], 2, "Dosage 3");
        arr[3] = new Prescription("P0002", "D0007", "Testing 4", meds[1], 2, "Dosage 5");
        arr[4] = new Prescription("P0002", "D0007", "Testing 5", meds[1], 2, "Dosage 6");
        try{
            FileWriter.writePrescriptions(arr);
        }catch(Exception e){}
    }
    public static void populateAppRequests(){
        Appointment output[] = new Appointment[5];
        output[0] = new Appointment("0000", "P0002", "D0007", "01012000", "req");
        output[1] = new Appointment("0001", "P0003", "D0007", "01012001", "req2");
        output[2] = new Appointment("0002", "P0004", "D0007", "01012002", "req2");
        output[3] = new Appointment("0003", "P0002", "D0007", "01012003", "tesreq2req2req2ting4");
        output[4] = new Appointment("0004", "P0003", "D0007", "01012004", "testreq2ing5");
        try{
            FileWriter.writeAppointmentRequests(output);
        }catch(Exception e){
            
        }
    }
}
