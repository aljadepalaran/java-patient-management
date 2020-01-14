package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;

/**
 * A class for adding/removing a single object into the system.
 * Class also contains methods to remove null elements from arrays.
 * @author palar
 */
public class Augment {
    
    /**
     * Adds a user.
     * @param _input 
     */
    public static void addUser(User _input){
        
        User output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readUsers();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.userArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeUsers(output);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }         
    
    /**
     * Adds a rating.
     * @param _input 
     */
    public static void addRating(Rating _input){
        
        Rating output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readRatings();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.ratingArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeRatings(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }                           
    
    /**
     * Adds a feedback.
     * @param _input 
     */
    public static void addFeedback(Feedback _input){
        
        Feedback output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readFeedback();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.feedbackArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeFeedbacks(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }                       
    
    /**
     * Adds a prescription.
     * @param _input 
     */
    public static void addPrescription(Prescription _input){
        
        Prescription output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readPrescriptions();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.prescriptionArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writePrescriptions(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }               
    
    /**
     * Adds an appointment.
     * @param _input 
     */
    public static void addAppointment(Appointment _input){
        
        Appointment output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readAppointments();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.appointmentArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeAppointments(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }                 
    
    /**
     * Adds a user to account creation requests.
     * @param _input 
     */
    public static void addRequest(User _input){
        
        User output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.userArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeAccountRequests(output);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }                            
    
    /**
     * Adds a medicine.
     * @param _input 
     */
    public static void addMedicine(Medicine _input){
        Medicine output[] = null;
        boolean hasNull = false;
        try{
            output = FileReader.readMedicines();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
            else{}
        }
        if(hasNull == false){
            output = Resize.medicineArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeMedicines(output);
        }catch(Exception e){}
    }                       
    
    /**
     * Adds an order for medicine.
     * @param _input 
     */
    public static void addOrder(Medicine _input){
        Medicine output[] = null;
        boolean hasNull = false;
        try{
            output = FileReader.readOrderRequests();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){
                output[i] = _input;
                hasNull = true;
                break;
            }
            else{}
        }
        if(hasNull == false){
            output = Resize.medicineArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeMedicineOrders(output);
        }catch(Exception e){}
    }                          
    
    /**
     * Adds a request for an appointment.
     * @param _input 
     */
    public static void addAppointmentRequest(Appointment _input){
        Appointment output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readAppointmentRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.appointmentArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writeAppointmentRequests(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }          
    
    /**
     * Adds a proposed appointment.
     * Return is used to display whether it has gone throuugh or not.
     * @param _input
     * @return 
     */
    public static boolean addProposedAppointment(Appointment _input){
        Appointment output[] = null;
        boolean hasNull = false;
        boolean exists = false;
        boolean created = false;
        try{
            output = FileReader.readProposedAppointments();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            if(output[i].getDoctorID().compareTo(_input.getDoctorID()) == 0){
                if(output[i].getPatientID().compareTo(_input.getPatientID()) == 0){
                    exists = true;
                }
            }
        }
        //if already exists
        if(exists == false){
            for(int i = 0; i < output.length; i++){
                if(output[i] == null){//if there is space
                    output[i] = _input;
                    hasNull = true;
                    break;
                }else{}
            }
            if(hasNull == false){//if there was no space
                output = Resize.appointmentArray(output, output.length + 1);
                output[output.length - 1] = _input;
            }
            try{
                FileWriter.writeProposedAppointments(output);
            }catch(Exception e){
                System.out.println(e);
            }
            created = true;
        }else{
            created = false;
        }
        return created;
    }      
    
    /**
     * Adds a request for prescription.
     * @param _input 
     */
    public static void addPrescriptionRequest(Prescription _input){
        Prescription output[] = null;
        boolean hasNull = false;
        
        try{
            output = FileReader.readRequestedPrescriptions();
        }catch(Exception e){
            System.out.println(e);
        }
        
        for(int i = 0; i < output.length; i++){
            if(output[i] == null){//if there is space
                output[i] = _input;
                hasNull = true;
                break;
            }else{}
        }
        
        if(hasNull == false){//if there was no space
            output = Resize.prescriptionArray(output, output.length + 1);
            output[output.length - 1] = _input;
        }
        
        try{
            FileWriter.writePrescriptionRequests(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }        //Adds a prescription request by the doctor.
    
    /**
     * Removes a user.
     * @param _input 
     */
    public static void removeUser(String _input){
        User output[] = null;
        try{
            output = FileReader.readUsers();
            for(int i = 0; i < output.length; i++){
                if(output[i].getUniqueID().compareTo(_input) == 0){
                    output[i] = null;
                }
            }
            output = trimUsers(output);
            FileWriter.writeUsers(output);
        }catch(Exception e){}
    }                          
    
    /**
     * Removes a prescription
     * @param _input 
     */
    public static void removePrescription(String _input){
        Prescription output[] = null;
        try{
            output = FileReader.readPrescriptions();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getPrescriptionID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimPrescriptions(output);
        try{
            FileWriter.writePrescriptions(output);
        }catch(Exception e){}
    }                  
    
    /**
     * Removes an appointment request.
     * @param _input 
     */
    public static void removeAppointmentRequest(String _input){
        Appointment output[] = null;
        try{
            output = FileReader.readAppointmentRequests();
        
            for(int i = 0; i < output.length; i++){
                if(output[i].getAppointmentID().compareTo(_input) == 0){
                    output[i] = null;
                }
            }

            output = trimAppointments(output);
        
            FileWriter.writeAppointmentRequests(output);
        }catch(Exception e){
            System.out.println(e);
        }
    }            
    
    /**
     * Removes a user account creation request.
     * @param _input 
     */
    public static void removeApproval(String _input){
        User output[] = null;
        try{
            output = FileReader.readRequests();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getUniqueID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimUsers(output);
        try{
            FileWriter.writeAccountRequests(output);
        }catch(Exception e){}
    }                      
    
    /**
     * Removes an order for medicine.
     * @param _input 
     */
    public static void removeMedicineOrder(String _input){
        Medicine output[] = null;
        try{
            output = FileReader.readOrderRequests();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getMedicineName().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        
        output = trimMedicines(output); //removes null at the end of the file.
        try{
            FileWriter.writeMedicineOrders(output);
        }catch(Exception e){}
    }                 
    
    /**
     * Removes a proposed appointment.
     * @param _input 
     */
    public static void removeProposedAppointment(String _input){
        Appointment output[] = null;
        try{
            output = FileReader.readProposedAppointments();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getAppointmentID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimAppointments(output);
        try{
            FileWriter.writeProposedAppointments(output);
        }catch(Exception e){}
    }           
    
    /**
     * Removes a termination request.
     * @param _input 
     */
    public static void removeTerminationRequest(String _input){
        User output[] = null;
        try{
            output = FileReader.readAccountTerminationRequests();
            for(int i = 0; i < output.length; i++){
                if(output[i].getUniqueID().compareTo(_input) == 0){
                    output[i] = null;
                }
            }
            output = trimUsers(output);
            FileWriter.writeAccountTermRequests(output);
        }catch(Exception e){}
    }            
    
    /**
     * Removes a prescription request.
     * @param _input 
     */
    public static void removePrescriptionRequest(String _input){
        Prescription output[] = null;
        try{
            output = FileReader.readRequestedPrescriptions();
        }catch(Exception e){}
        for(int i = 0; i < output.length; i++){
            if(output[i].getPrescriptionID().compareTo(_input) == 0){
                output[i] = null;
            }
        }
        output = trimPrescriptions(output);
        try{
            FileWriter.writePrescriptionRequests(output);
        }catch(Exception e){}
    }           
    
    /**
     * Removes trailing null elements from a User[] array.
     * @param _input
     * @return 
     */
    public static User[] trimUsers(User[] _input){
        User[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenUsers(_input);
        }
        output = _input;
        return output;
    }                        
    
    /**
     * Removes trailing null elements from a Rating[] array.
     * @param _input
     * @return 
     */
    public static Rating[] trimRatings(Rating[] _input){
        Rating[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenRatings(_input);
        }
        output = _input;
        return output;
    }                   
    
    /**
     * Removes trailing null elements from Feedback[] array.
     * @param _input
     * @return 
     */
    public static Feedback[] trimFeedback(Feedback[] _input){
        Feedback[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenFeedback(_input);
        }
        output = _input;
        return output;
    }              
    
    /**
     * Removes trailing null elements from a Prescription[] array.
     * @param _input
     * @return 
     */
    public static Prescription[] trimPrescriptions(Prescription[] _input){
        Prescription[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        int notnull = 0;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] != null){
                notnull++;
            }
        }
        output = new Prescription[notnull];
        for(int i = 0; i < output.length; i++){
            output[i] = _input[i];
        }
        return output;
    } 
    
    /**
     * Removes trailing null elements from Appointment[] array.
     * @param _input
     * @return 
     */
    public static Appointment[] trimAppointments(Appointment[] _input){
        Appointment[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        int notnull = 0;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] != null){
                notnull++;
            }
        }
        output = new Appointment[notnull];
        for(int i = 0; i < output.length; i++){
            output[i] = _input[i];
        }
        return output;
    }    
    
    /**
     * Removes trailing null elements from User[] array - redundant.
     * @param _input
     * @return 
     */
    public static User[] trimRequests(User[] _input){
        User[] output = _input;
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        while(_input[_input.length - 1] == null){
            _input = Resize.shortenUsers(_input);
        }
        output = _input;
        return output;
    }                      
    
    /**
     * Removes trailing null elements from Medicine[] array.
     * @param _input
     * @return 
     */
    public static Medicine[] trimMedicines(Medicine[] _input){
        Medicine output[];
        for(int i = 0; i < _input.length; i++){
            if(_input[i] == null && i != _input.length - 1){
                _input[i] = _input[i + 1];
                _input[i+1] = null;
            }else{}
        }
        
        int notnull = 0;
        
        for(int i = 0; i < _input.length; i++){
            if(_input[i] != null){
                notnull++;
            }
        }
        output = new Medicine[notnull];
        for(int i = 0; i < output.length; i++){
            output[i] = _input[i];
        }
        
        return output;
    }
}
