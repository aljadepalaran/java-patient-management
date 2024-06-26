package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;
import java.io.*;

/**
 * Class contains display methods for debugging purposes.
 * @author palar
 */
public class Display {
    
    public static void displayUsers(){
        User[] output = null;
        try{
            output = FileReader.readUsers();
        }catch(Exception e){
            System.out.println("Error! Flag DEFI! " + e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getUniqueID() + ":" + output[i].getPassword()
            + ":" + output[i].getFirstName() + ":" + output[i].getLastName() + ":" + output[i].getHasObservable());
        }
    }//all users
    public static void displayRatings(){
        Rating ratings[] =  null;
        try{
            ratings = FileReader.readRatings();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < ratings.length; i++){
            System.out.println(ratings[i].getDoctorID() + ":" + ratings[i].getPatientID() 
                    + ":" + ratings[i].getRatingValue() + ":" + ratings[i].getMessage());
        }
    
    }//all ratings
    public static void displayFeedback(){
        Feedback feedbacks[] =  null;
        try{
            feedbacks = FileReader.readFeedback();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < feedbacks.length; i++){
            System.out.println(feedbacks[i].getFeedbackID() + ":" + feedbacks[i].getDoctorID() 
                    + ":" + feedbacks[i].getPatientID() 
                    + ":" + feedbacks[i].getAdminID() + ":" 
                    + feedbacks[i].getFeedback());
        }
    }//all feedback
    public static void displayPrescriptions(){
        Prescription output[] =  null;
        try{
            output = FileReader.readPrescriptions();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getPrescriptionID() + ":" + output[i].getPatientID() + ":" + output[i].getDoctorID() 
                    + ":" + output[i].getNotes() + ":" + output[i].getMedicineType()
                    + ":" + output[i].getQuantity()+ ":" + output[i].getDosage());
        }
    }//all prescriptions
    public static void displayAppointments(){
        Appointment output[] =  null;
        try{
            output = FileReader.readAppointments();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getAppointmentID() + ":" + output[i].getPatientID() + ":" + output[i].getDoctorID() 
                    + ":" + output[i].getDate() + ":" + output[i].getNotes() + ":" + output[i].getObserverOne() + ":" + output[i].getObserverTwo());
        }
    }//all appointments
    public static void displayRequests(){
        User output[] =  null;
        try{
            output = FileReader.readRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getUniqueID() + ":" 
                    + output[i].getFirstName() + ":" + output[i].getLastName());
        }
    }//user account creation
    public static void displayMedicines(){
        Medicine output[] = null;
        try{
            output = FileReader.readMedicines();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getMedicineName() + ":" + output[i].getStock());
        }
    }//all meds
    public static void displayOrders(){
        Medicine output[] = null;
        try{
            output = FileReader.readOrderRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getMedicineName() + ":" + output[i].getStock());
        }
    }//stock orders
    public static void displayAppRequests(){
        Appointment output[] = null;
        try{
            output = FileReader.readAppointmentRequests();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getAppointmentID() + ":" + output[i].getPatientID() + ":" + output[i].getDoctorID() 
                    + ":" + output[i].getDate() + ":" + output[i].getNotes());
        }
    }//appointment requests from patient
    public static void displayProposed(){
        Appointment output[] = null;
        try{
            output = FileReader.readProposedAppointments();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getAppointmentID() + ":" + output[i].getPatientID() + ":" + output[i].getDoctorID() 
                    + ":" + output[i].getDate() + ":" + output[i].getNotes());
        }
    }//appointment proposals
    public static void displayTerminationRequests(){
        User[] output = null;
        try{
            output = FileReader.readAccountTerminationRequests();
        }catch(Exception e){
            System.out.println("Error! Flag DEFI! " + e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getUniqueID() + ":" + output[i].getPassword()
            + ":" + output[i].getFirstName() + ":" + output[i].getLastName());
        }
    }//termination requests
    public static void displayPrescriptionRequests(){
        Prescription output[] =  null;
        try{
            output = FileReader.readRequestedPrescriptions();
        }catch(Exception e){
            System.out.println(e);
        }
        for(int i = 0; i < output.length; i++){
            System.out.println(output[i].getPrescriptionID() + ":" + output[i].getPatientID() + ":" + output[i].getDoctorID() 
                    + ":" + output[i].getNotes() + ":" + output[i].getMedicineType()
                    + ":" + output[i].getQuantity()+ ":" + output[i].getDosage());
        }
    }
}
