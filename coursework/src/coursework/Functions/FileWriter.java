package coursework.Functions;

import coursework.Objects.*;
import coursework.Users.User;
import java.io.*;

public class FileWriter {
    
    public static void writeUsers(User[] _array) throws IOException{                                      //Writes the array of users into a file.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Users.txt"));
        outputStream.writeObject(_array);       
    }
    
    public static void writeRatings(Rating[] _array) throws IOException{                                      //Writes the array of users into a file.
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
    
    public static void writeRequests(User[] _array) throws IOException{                                      //Writes requests for account creation.
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Requests.txt"));
        outputStream.writeObject(_array);       
    }
}
