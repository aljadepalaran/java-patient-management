package coursework.Functions;

import coursework.Objects.*;
import coursework.Users.User;
import java.io.*;

public class FileReader {
    
    public static User[] readUsers() throws IOException, ClassNotFoundException{                                     //Reads the array of users from a file.   
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Users.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       //Typecasting
        return output;
    }   //reads all users in the system
    public static Rating[] readRatings() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Ratings.txt"));
        Rating output[] = (Rating[]) inputStream.readObject();
        return output;
    }   //reads all ratings in the system
    public static Feedback[] readFeedback() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Feedback.txt"));
        Feedback output[] = (Feedback[]) inputStream.readObject();
        return output;
    }   //reads all feedbacks in the system
    public static Prescription[] readPrescriptions() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Prescriptions.txt"));
        Prescription output[] = (Prescription[]) inputStream.readObject();
        return output;
    }   //reads all prescriptions in the system
    public static Appointment[] readAppointments() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Appointments.txt"));
        Appointment output[] = (Appointment[]) inputStream.readObject();
        return output;
    }   //reads all appointments in the system
    public static User[] readRequests() throws IOException, ClassNotFoundException{                                     //Reads the array of users from a file.   
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Requests.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       //Typecasting
        return output;
    }   //reads all account creation requests
    public static Appointment[] readAppointmentRequests() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("AppRequests.txt"));
        Appointment output[] = (Appointment[]) inputStream.readObject();
        return output;
    }   //reads patient appointment requests
    public static User[] readAccountTermRequests() throws IOException, ClassNotFoundException{                   //for termination of accounts  
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Terminations.txt"));
        User output[] = (User[]) inputStream.readObject();                                                       
        return output;
    }   //reads account termination requests
    public static Medicine[] readMedicines() throws IOException, ClassNotFoundException{                   //for termination of accounts  
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Medicines.txt"));
        Medicine output[] = (Medicine[]) inputStream.readObject();                                                       
        return output;
    }   //read medicines in the system
    public static Medicine[] readOrders() throws IOException, ClassNotFoundException{
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("OrderRequests.txt"));
        Medicine output[] = (Medicine[]) inputStream.readObject();                                                       
        return output;
    }
}
