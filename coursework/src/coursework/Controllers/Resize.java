package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;
import coursework.Models.Users.Patient;

/**
 * A class to resize arrays of a specific type.
 * @author palar
 */
public class Resize {
    
    //ADD
    public static User[] userArray(User[] _array, int _newSize){
        User outputArray[] = new User[_newSize];
        for(int i = 0; i < _array.length; i++){                                                                                         //Copies the values over.
            outputArray[i] = _array[i];
        }
        return outputArray;
    }
    public static Rating[] ratingArray(Rating[] _array, int _size){
        Rating output[] = new Rating[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static Feedback[] feedbackArray(Feedback[] _array, int _size){
        Feedback output[] = new Feedback[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static Appointment[] appointmentArray(Appointment[] _array, int _size){
        Appointment output[] = new Appointment[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static Prescription[] prescriptionArray(Prescription[] _array, int _size){
        Prescription output[] = new Prescription[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static String[] stringArray(String[] _array, int _size){
        String output[] = new String[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static Medicine[] medicineArray(Medicine[] _array, int _size){
        Medicine output[] = new Medicine[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    public static Patient[] patientArray(Patient[] _array, int _size){
        Patient output[] = new Patient[_size];
        for(int i = 0; i < _array.length; i++){
            output[i] = _array[i];
        }
        return output;
    }
    
    //REMOVE
    public static User[] shortenUsers(User[] _input){
        User output[] = new User[_input.length - 1];                    //New array one size down.
        for(int i = 0; i < output.length; i++){
            output[i] = _input[i];                                      //Copies all values up to the new size.
        }
        return output;
    }
    public static Rating[] shortenRatings(Rating[] _input){
        Rating output[] = new Rating[_input.length - 1];                
        for(int i = 0; i < output.length - 1; i++){
            output[i] = _input[i];                                      
        }
        return output;
    }
    public static Feedback[] shortenFeedback(Feedback[] _input){
        Feedback output[] = new Feedback[_input.length - 1];                
        for(int i = 0; i < output.length - 1; i++){
            output[i] = _input[i];                                      
        }
        return output;
    }
    public static Appointment[] shortenAppointment(Appointment[] _input){
        Appointment output[] = new Appointment[_input.length - 1];                
        for(int i = 0; i < output.length - 1; i++){
            output[i] = _input[i];                                      
        }
        return output;
    }
    public static Prescription[] shortenPrescription(Prescription[] _input){
        Prescription output[] = new Prescription[_input.length - 1];                
        for(int i = 0; i < output.length - 1; i++){
            output[i] = _input[i];                                      
        }
        return output;
    }
    public static Medicine[] shortenMedicines(Medicine[] _input){
        Medicine output[] = new Medicine[_input.length - 1];
        for(int i = 0; i < output.length - 1; i++){
            output[i] = _input[i];                                      
        }
        return output;
    }
    
}