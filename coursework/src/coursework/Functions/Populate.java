package coursework.Functions;

import coursework.Users.*;

public class Populate {
    
    public static void populateFile(){
        populateUsers();
        populateAppointments();
        populateFeedbacks();
        populateMedicines();
        populatePrescriptions();
        populateRatings();
    }
    
    public static void populateUsers(){
        User[] output = new User[20];
        output[0] = new Administrator("A0000", "adm1np455", "Admin", "One");
        output[1] = new Administrator("A0001", "admin2", "Admin", "Two");
        output[2] = new Administrator("A0002", "testpass", "Admin", "Three");
        output[3] = new Secretary("S0000", "s3cr3t", "Secretary", "One");
        output[4] = new Secretary("S0001", "mypass", "Secretary", "Two");
        output[5] = new Doctor("D0000", "banana123", "Doctor", "One", "Plymouth");
        output[6] = new Doctor("D0001", "apple4", "Doctor", "Two", "Taunton");
        output[7] = new Doctor("D0002", "doctorgreat", "Doctor", "Three", "Bristol");
        output[8] = new Doctor("D0003", "am4zing", "Doctor", "Four", "London");
        output[9] = new Patient("P0000", "p4ssw0rd", "Patient", "Zero", "Earth", 'M', "01012000");
        output[10] = new Patient("P0001", "password123", "Secretary", "One", "Address", 'M', "00000000");
        output[11] = new Patient("P0002", "qwerty", "Secretary", "One", "Address", 'M', "00000000");
        output[12] = new Patient("P0003", "1234567890", "Secretary", "One", "Address", 'M', "00000000");
        output[13] = new Patient("P0004", "password", "Secretary", "One", "Address", 'M', "00000000");
        output[14] = new Patient("P0005", "incorrect", "Secretary", "One", "Address", 'M', "00000000");
        output[15] = new Patient("P0006", "football", "Secretary", "One", "Address", 'M', "00000000");
        output[16] = new Patient("P0007", "basketball", "Secretary", "One", "Address", 'M', "00000000");
        output[17] = new Patient("P0008", "mywife", "Secretary", "One", "Address", 'M', "00000000");
        output[18] = new Patient("P0009", "computers", "Secretary", "One", "Address", 'M', "00000000");
        output[19] = new Patient("P0010", "asdfg", "Secretary", "One", "Address", 'M', "00000000");
    }
    public static void populateAppointments(){
        
    }
    public static void populateFeedbacks(){
        
    }
    public static void populateMedicines(){
        
    }
    public static void populatePrescriptions(){
        
    }
    public static void populateRatings(){
        
    }
    public static void populateTerminationRequests(){
        
    }
    public static void populateProposedAppointments(){
        
    }
    public static void populateAppointmentRequests(){
        
    }
    public static void populateOrders(){
        
    }
}
