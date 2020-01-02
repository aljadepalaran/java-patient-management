package coursework.Functions;

import coursework.Objects.*;
import coursework.Users.User;
import java.io.*;

public class FileWriter {
    
    public static void writeUsers(User[] _array) throws IOException{                                            //Writes the array of users into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        outputStream.writeObject(_array);       
    }
    public static void writeRatings(Rating[] _array) throws IOException{                                        //Writes the array of ratings into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Ratings.txt"));
        outputStream.writeObject(_array);       
    } 
    public static void writeFeedbacks(Feedback[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Feedback.txt"));
        outputStream.writeObject(_array);   
    }
    public static void writePrescriptions(Prescription[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Prescriptions.txt"));
        outputStream.writeObject(_array);  
    }
    public static void writeAppointments(Appointment[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Appointments.txt"));
        outputStream.writeObject(_array);  
    }
    public static void writeAccountRequests(User[] _array) throws IOException{                                      
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Requests.txt"));
        outputStream.writeObject(_array);       
    }               //Request for account creation (patient).
    public static void writeAppointmentRequests(Appointment[] _array) throws IOException{                           //Request for appointments.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("AppRequests.txt"));
        outputStream.writeObject(_array);
    }
    public static void writeAccountTermRequests(User[] _array) throws IOException{                                      //Writes requests for account termination
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Terminations.txt"));
        outputStream.writeObject(_array);       
    }
    public static void writeMedicines(Medicine[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Medicines.txt"));
        outputStream.writeObject(_array);   
    }
    public static void writeMedicineOrders(Medicine[] _array) throws IOException{
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("OrderRequests.txt"));
        outputStream.writeObject(_array);   
    }
    public static void writeProposedAppointments(Appointment[] _array) throws IOException{                           //Request for appointments.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ProposedAppointments.txt"));
        outputStream.writeObject(_array);
    }
}
