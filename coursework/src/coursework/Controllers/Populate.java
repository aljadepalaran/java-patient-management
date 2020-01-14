package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.Secretary;
import coursework.Models.Users.Doctor;
import coursework.Models.Users.User;
import coursework.Models.Users.Administrator;
import coursework.Models.Users.Patient;

/**
 * A class used to populate the data files in case of file corruption.
 * @author palar
 */
public class Populate {
    
    public static void populateFile(){
        populateUsers();
        populateAppointments();
        populateFeedbacks();
        populateMedicines();
        populatePrescriptions();
        populateRatings();
        populateTerminationRequests();
        populateProposedAppointments();
        populateAppointmentRequests();
        populateOrders();
        populatePrescriptionRequests();
        populateAccountRequests();
    }
    
    public static void populateUsers(){
        try{
            
            User[] output = new User[20];

            //ADMINS
            output[0] = new Administrator("A0000", "adm1np455", "Admin", "One");
            output[1] = new Administrator("A0001", "admin2", "Admin", "Two");
            output[2] = new Administrator("A0002", "testpass", "Admin", "Three");
 
            //SECRETARIES
            output[3] = new Secretary("S0000", "s3cr3t", "Richard", "Smiley");
            output[4] = new Secretary("S0001", "mypass", "Angela", "Collins");

            //DOCTORS
            output[5] = new Doctor("D0000", "banana123", "Janet", "Strine", "48 Walwyn Rd");
            output[6] = new Doctor("D0001", "apple4", "Gary", "Rouse", "29 Kent Street");
            output[7] = new Doctor("D0002", "doctorgreat", "Billy", "Hill", "74 St Maurices Road");
            output[8] = new Doctor("D0003", "am4zing", "Diana", "Moreno", "47 Argyll Street");

            //PATIENTS
            output[9] = new Patient("P0000", "p4ssw0rd", "Patient", "Zero", "Earth", 'M', "01012000");
            output[10] = new Patient("P0001", "password123", "Bradd", "Wick", "Secret", 'M', "18121963");
            output[11] = new Patient("P0002", "qwerty", "John", "Pitt", "Everywhere", 'M', "02091964");
            output[12] = new Patient("P0003", "1234567890", "Steve", "Zuckerberg", "Apple Factory", 'M', "24021955");
            output[13] = new Patient("P0004", "password", "James", "Bezos", "London", 'M', "11091920");
            output[14] = new Patient("P0005", "incorrect", "Mark", "Jobs", "Internet", 'M', "14051984");
            output[15] = new Patient("P0006", "football", "Jeff", "Bond", "Amazon Office", 'M', "12011964");
            output[16] = new Patient("P0007", "basketball", "Meryl", "Winfrey", "Nowhere", 'F', "22061949");
            output[17] = new Patient("P0008", "mywife", "Opra", "Streep", "Television", 'F', "29011954");
            output[18] = new Patient("P0009", "computers", "Ellen", "Jordan", "LIVE", 'F', "26011958");
            output[19] = new Patient("P0010", "jumpman", "Michael", "DeGeneres", "Address", 'M', "17021963");
        
            FileWriter.writeUsers(output);
            
        }catch(Exception e){}
    }
    public static void populateAppointments(){
        try{
            
            Appointment output[] = new Appointment[10];

            //No notes.
            output[0] = new Appointment("0001", "P0000", "D0000", "01012010", "");
            output[0].registerObserver("P0000");
            output[0].registerObserver("D0000");
            output[0].notifyObserver();
            output[1] = new Appointment("0002", "P0000", "D0001", "02022010", "");
            output[1].registerObserver("P0000");
            output[1].registerObserver("D0001");
            output[1].notifyObserver();
            output[2] = new Appointment("0003", "P0001", "D0002", "03032010", "");
            output[2].registerObserver("P0001");
            output[2].registerObserver("D0002");
            output[2].notifyObserver();
            output[3] = new Appointment("0004", "P0002", "D0003", "04042010", "");
            output[3].registerObserver("P0002");
            output[3].registerObserver("D0003");
            output[3].notifyObserver();
            output[4] = new Appointment("0005", "P0003", "D0001", "05052010", "");
            output[4].registerObserver("P0003");
            output[4].registerObserver("D0001");
            output[4].notifyObserver();

            //With notes.
            output[5] = new Appointment("0006", "P0003", "D0001", "06062010", "P0003 and D0001");
            output[5].registerObserver("P0003");
            output[5].registerObserver("D0001");
            output[5].notifyObserver();
            output[6] = new Appointment("0007", "P0004", "D0002", "07072010", "The patient was very late.");
            output[6].registerObserver("P0004");
            output[6].registerObserver("D0002");
            output[6].notifyObserver();
            output[7] = new Appointment("0008", "P0005", "D0003", "08082010", "The patient did not seem to be coping.");
            output[7].registerObserver("P0005");
            output[7].registerObserver("D0003");
            output[7].notifyObserver();
            output[8] = new Appointment("0009", "P0001", "D0000", "09092010", "The patient has vanished.");
            output[8].registerObserver("P0001");
            output[8].registerObserver("D0000");
            output[8].notifyObserver();
            output[9] = new Appointment("0010", "P0006", "D0000", "10102010", "Successful appointment.");
            output[9].registerObserver("P0006");
            output[9].registerObserver("D0000");
            output[9].notifyObserver();
        
            FileWriter.writeAppointments(output);
            
        }catch(Exception e){}
    }
    public static void populateFeedbacks(){
        try{
            
            Feedback output[] = new Feedback[5];

            output[0] = new Feedback("0000", "D0001", "P0005", "A0000", "Feedback from Admin One.");
            output[1] = new Feedback("0001", "D0002", "P0007", "A0001", "Feedback from Admin Two.");
            output[2] = new Feedback("0002", "D0003", "P0007", "A0002", "Feedback from Admin Three.");
            output[3] = new Feedback("0003", "D0001", "P0002", "A0000", "You're doing great.");
            output[4] = new Feedback("0004", "D0000", "P0003", "A0000", "Keep up the good work.");
        
            FileWriter.writeFeedbacks(output);
            
        }catch(Exception e){}
    }
    public static void populateMedicines(){
        try{
            Medicine output[] = new Medicine[15];

            //In stock.
            output[0] = new Medicine("Codeine", "Treat mild to moderately severe pain.", 50);
            output[1] = new Medicine("Adderall", "Treat ADHD.", 50);
            output[2] = new Medicine("Losartan", "Treat hypertension.", 50);
            output[3] = new Medicine("Xanax", "Treat anxiety and panic disorders.", 50);
            output[4] = new Medicine("Viagra", "Increase blood flow to particular areas of the body.", 50);
            output[5] = new Medicine("Ibuprofen", "A nonsteroidal anti-inflammatory drug.", 50);
            output[6] = new Medicine("Tramadol", "Narcotic-like pain reliever.", 50);
            output[7] = new Medicine("Amoxicillin", "Penicillin antibiotic to fight bacteria.", 50);
            output[8] = new Medicine("Ativan", "Treat anxiety disorders.", 50);
            output[9] = new Medicine("Morphine", "A very strong painkiller.", 50);

            //Out of Stock.
            output[10] = new Medicine("Oxycodone", "An opioid pain medication.", 0);
            output[11] = new Medicine("Lyrica", "An anti-epileptic drug.", 0);
            output[12] = new Medicine("Gagapentin", "Treat neuropathic pain.", 0);
            output[13] = new Medicine("Benadryl", "An antihistamine to treat allergy.", 0);
            output[14] = new Medicine("Valium", "Treat anxiety, alcohol withdrawal and seizures.", 0);

            FileWriter.writeMedicines(output);
            
        }catch(Exception e){}
    }
    public static void populatePrescriptions(){
        try{
            
            Medicine input[] = FileReader.readMedicines();
            Prescription output[] = new Prescription[5];

            output[0] = new Prescription("0000", "P0000", "D0000", "P0000 requires Codeine.", input[0], 10, "Dosage for Codeine.");
            output[1] = new Prescription("0001", "P0001", "D0002", "P0001 requires Adderall.", input[1], 5, "Dosage for Adderall.");
            output[2] = new Prescription("0002", "P0002", "D0001", "P0002 requires Losartan.", input[2], 2, "Dosage for Losartan.");
            output[3] = new Prescription("0003", "P0001", "D0003", "P0001 requires Xanax.", input[3], 15, "Dosage for Xanax.");
            output[4] = new Prescription("0004", "P0005", "D0002", "P0005 requires Viagra.", input[4], 7, "Dosage for Viagra.");
            
            FileWriter.writePrescriptions(output);
            
        }catch(Exception e){}
    }
    public static void populateRatings(){
        try{
            Rating output[] = new Rating[5];

            output[0] = new Rating("D0000", "P0002", 0, "Appauling performance.");
            output[1] = new Rating("D0001", "P0004", 1, "Not a very good doctor.");
            output[2] = new Rating("D0002", "P0003", 3, "Definitely better than some.");
            output[3] = new Rating("D0003", "P0006", 4, "Can improve a little.");
            output[4] = new Rating("D0003", "P0004", 5, "Absolute amazing. Best doctor ever.");
        
            FileWriter.writeRatings(output);
        
        }catch(Exception e){}
    }
    public static void populateTerminationRequests(){
        try{
            User output[] = new User[3];

            output[0] = new Patient("P0008", "mywife", "Opra", "Streep", "Television", 'F', "29011954");
            output[1] = new Patient("P0009", "computers", "Ellen", "Jordan", "LIVE", 'F', "26011958");
            output[2] = new Patient("P0010", "jumpman", "Michael", "DeGeneres", "Address", 'M', "17021963");
        
            FileWriter.writeAccountTermRequests(output);
            
        }catch(Exception e){}
    }
    public static void populateProposedAppointments(){
        try{
            
            Appointment output[] = new Appointment[5];

            output[0] = new Appointment("0011", "P0001", "D0001", "01022010", "");
            output[1] = new Appointment("0012", "P0003", "D0000", "02032011", "");
            output[2] = new Appointment("0013", "P0004", "D0001", "03042012", "");
            output[3] = new Appointment("0014", "P0006", "D0003", "04052013", "");
            output[4] = new Appointment("0015", "P0004", "D0002", "05062014", "");
        
            FileWriter.writeProposedAppointments(output);
            
        }catch(Exception e){}
    }
    public static void populateAppointmentRequests(){
        try{
            Appointment output[] = new Appointment[5];

            output[0] = new Appointment("0016", "P0005", "D0001", "11022014", "");
            output[1] = new Appointment("0017", "P0006", "D0000", "12032013", "");
            output[2] = new Appointment("0018", "P0007", "D0001", "13042012", "");
            output[3] = new Appointment("0019", "P0001", "D0003", "14052011", "");
            output[4] = new Appointment("0020", "P0002", "D0002", "15062010", "");
        
            FileWriter.writeAppointmentRequests(output);
            
        }catch(Exception e){}
    }
    public static void populateOrders(){
        try{
            Medicine output[] = new Medicine[7];

            output[0] = new Medicine("Valium", "Treat anxiety, alcohol withdrawal and seizures.", 100);
            output[1] = new Medicine("Adderall", "Treat ADHD.", 80);
            output[2] = new Medicine("Losartan", "Treat hypertension.", 95);
            output[3] = new Medicine("Lyrica", "An anti-epileptic drug.", 200);
            output[4] = new Medicine("Viagra", "Increase blood flow to particular areas of the body.", 500);
            output[5] = new Medicine("Ibuprofen", "A nonsteroidal anti-inflammatory drug.", 100);
            output[6] = new Medicine("Benadryl", "An antihistamine to treat allergy.", 50);

            FileWriter.writeMedicineOrders(output);
            
        }catch(Exception e){}
    }
    public static void populatePrescriptionRequests(){
        try{
            
            Medicine input[] = FileReader.readMedicines();
            Prescription output[] = new Prescription[5];
            
            output[0] = new Prescription("0005", "P0000", "D0001", "P0000 requires Ibuprofen.", input[5], 10, "Dosage for Ibuprofen.");
            output[1] = new Prescription("0006", "P0001", "D0003", "P0001 requires Tramadol.", input[6], 5, "Dosage for Tramadol.");
            output[2] = new Prescription("0007", "P0002", "D0002", "P0002 requires Amoxicillin.", input[7], 2, "Dosage for Amoxicillin.");
            output[3] = new Prescription("0008", "P0003", "D0001", "P0001 requires Ativan.", input[8], 15, "Dosage for Ativan.");
            output[4] = new Prescription("0009", "P0005", "D0002", "P0005 requires Morphine.", input[9], 7, "Dosage for Morphine.");
            
            FileWriter.writePrescriptionRequests(output);

        }catch(Exception e){}
    }
    public static void populateAccountRequests(){
        try{
        
            User output[] = new User[5];
            
            output[0] = new Patient("P0011", "walls", "Donald", "Obama", "Mexican Border", 'M', "14061946");
            output[1] = new Patient("P0012", "POTUS", "Barack", "Trump", "USA", 'M', "04081961");
            output[2] = new Patient("P0013", "suits", "Barney", "Story", "MacLaren's", 'M', "16081976");
            output[3] = new Patient("P0014", "story123", "Geraldine", "Stinson", "2834 Traction Street", 'F', "27071999");
            output[4] = new Patient("P0015", "Angthe", "Giovanni", "Carney", "37 Old Chapel Road", 'M', "27091954");
            
            FileWriter.writeAccountRequests(output);
            
        }catch(Exception e){}
    }
}
