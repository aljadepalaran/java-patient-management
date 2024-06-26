package coursework.Controllers;

import coursework.Models.Objects.Medicine;
import coursework.Models.Objects.Appointment;
import coursework.Models.Objects.Rating;
import coursework.Models.Objects.Prescription;
import coursework.Models.Objects.Feedback;
import coursework.Models.Users.User;
import java.io.*;
/**
 * A class for writing data to files.
 * @author palar
 */
public class FileWriter {
    public static void writeUsers(User[] _array) throws IOException{                                            
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        outputStream.writeObject(_array);
    }                           //Writes users into the system. 
    
    public static void writeRatings(Rating[] _array) throws IOException{                                        
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Ratings.txt"));
        outputStream.writeObject(_array);       
    }                       //Writes ratings into the system.
    
    public static void writeFeedbacks(Feedback[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Feedback.txt"));
        outputStream.writeObject(_array);   
    }                   //Writes feedbacks into the system.
    
    public static void writePrescriptions(Prescription[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Prescriptions.txt"));
        outputStream.writeObject(_array);  
    }           //Writes prescriptions into the system.
    
    public static void writeAppointments(Appointment[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Appointments.txt"));
        outputStream.writeObject(_array);  
    }             //Writes appointments.
    
    public static void writeAccountRequests(User[] _array) throws IOException{                                      
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Requests.txt"));
        outputStream.writeObject(_array);       
    }                 //Writes account requests from the patient.
    
    public static void writeAppointmentRequests(Appointment[] _array) throws IOException{                           
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("AppRequests.txt"));
        outputStream.writeObject(_array);
    }      //Writes appointment requests from the patient.
    
    public static void writeAccountTermRequests(User[] _array) throws IOException{                                      
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Terminations.txt"));
        outputStream.writeObject(_array);       
    }             //Writes account termination requests.
    
    public static void writeMedicines(Medicine[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Medicines.txt"));
        outputStream.writeObject(_array);   
    }                   //Writes medicines.
    
    public static void writeMedicineOrders(Medicine[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("OrderRequests.txt"));
        outputStream.writeObject(_array);   
    }              //Writes stock orders from the doctor.
    
    public static void writeProposedAppointments(Appointment[] _array) throws IOException{                           
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ProposedAppointments.txt"));
        outputStream.writeObject(_array);
    }     //Writes proposed appointment from the doctor.
    
    public static void writePrescriptionRequests(Prescription[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("PrescriptionRequests.txt"));
        outputStream.writeObject(_array);  
    }    //Writes prescription requests.
}
