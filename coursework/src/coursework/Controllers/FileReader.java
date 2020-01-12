package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;
import java.io.*;

    /**
    *
    * The class reads in the data and outputs the data as an array.
    */
public class FileReader {
    
    /**
     * Reads all of the users in the system.
     * Returns an array of users.
     */
    public static User[] readUsers() throws IOException, ClassNotFoundException{                                     
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       
        return output;
    }                           //Reads all users in the system.
    
    /**
     * Reads all of the ratings in the system.
     * Returns an array of ratings.
     */
    public static Rating[] readRatings() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Ratings.txt"));
        Rating output[] = (Rating[]) inputStream.readObject();
        return output;
    }                       //Reads all ratings in the system.
    
    /**
     * Reads all of the feedback in the system.
     * Returns an array of feedback.
     */
    public static Feedback[] readFeedback() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Feedback.txt"));
        Feedback output[] = (Feedback[]) inputStream.readObject();
        return output;
    }                    //Reads all feedbacks in the system.
    
    /**
     * Reads all of the prescriptions in the system.
     * Returns an array of prescriptions.
     */
    public static Prescription[] readPrescriptions() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Prescriptions.txt"));
        Prescription output[] = (Prescription[]) inputStream.readObject();
        return output;
    }           //Reads all prescriptions in the system.
    
    /**
     * Reads all of the appointments in the system.
     * Returns an array of appointments.
     */
    public static Appointment[] readAppointments() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Appointments.txt"));
        Appointment output[] = (Appointment[]) inputStream.readObject();
        return output;
    }             //Reads all appointments in the system.
    
    /**
     * Reads all of the patient account creation requests on the system.
     * Returns an array of users.
     */
    public static User[] readRequests() throws IOException, ClassNotFoundException{                                     //Reads the array of users from a file.   
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Requests.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       //Typecasting
        return output;
    }                        //Reads all account creation requests.
    
    /**
     * Reads all of the appointment requests in the system.
     * Returns an array of appointments.
     */
    public static Appointment[] readAppointmentRequests() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("AppRequests.txt"));
        Appointment output[] = (Appointment[]) inputStream.readObject();
        return output;
    }      //Reads patient appointment requests.
    
    /**
     * Reads all of the account termination requests in the system.
     * Returns an array of accounts.
     */
    public static User[] readAccountTerminationRequests() throws IOException, ClassNotFoundException{                   //for termination of accounts  
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Terminations.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       
        return output;
    }      //Reads account termination requests.
    
    /**
     * Reads all of the medicines on the system.
     * Returns an array of medicines.
     */
    public static Medicine[] readMedicines() throws IOException, ClassNotFoundException{                   //for termination of accounts  
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Medicines.txt"));
        Medicine output[] = (Medicine[]) inputStream.readObject();                                                       
        return output;
    }                   //Read medicines in the system.
    
    /**
     * Reads all of the medicine order requests on the system.
     * Returns an array of medicines.
     */
    public static Medicine[] readOrderRequests() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("OrderRequests.txt"));
        Medicine output[] = (Medicine[]) inputStream.readObject();                                                       
        return output;
    }               //Reads the order requests.
    
    /**
     * Reads all of the proposed appointments in the system.
     * Returns an array of appointments.
     */
    public static Appointment[] readProposedAppointments() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ProposedAppointments.txt"));
        Appointment output[] = (Appointment[]) inputStream.readObject();
        return output;
    }     //Reads patient appointment requests.
    
    /**
     * Reads all of the requested prescriptions in the system.
     * Returns an array of prescriptions.
     */
    public static Prescription[] readRequestedPrescriptions() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("PrescriptionRequests.txt"));
        Prescription output[] = (Prescription[]) inputStream.readObject();
        return output;
       //reads all prescriptions in the system
    }  //Reads the requested prescriptions.
}
